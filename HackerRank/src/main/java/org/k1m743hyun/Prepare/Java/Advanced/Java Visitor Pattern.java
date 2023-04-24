import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

enum Color {
    RED, GREEN
}

abstract class Tree {
    
    private int value;
    private Color color;
    private int depth;
    
    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }
    
    public int getValue() {
        return value;
    }
    
    public Color getColor() {
        return color;
    }
    
    public int getDepth() {
        return depth;
    }
    
    public abstract void accept(TreeVisitor visitor);
}

class TreeNode extends Tree {
    
    private ArrayList<Tree> children = new ArrayList<>();
    
    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }
    
    @Override
    public void accept(TreeVisitor visitor) {
        visitor.visitNode(this);
        for (Tree child : children) {
            child.accept(visitor);
        }
    }
    
    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {
    
    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }
    
    @Override
    public void accept(TreeVisitor visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVisitor {
    
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);
}

class SumInLeavesVisitor extends TreeVisitor {
    
    int result = 0;
    
    @Override
    public int getResult(){
        return result;
    }
    
    @Override
    public void visitNode(TreeNode node){
    }
    
    @Override
    public void visitLeaf(TreeLeaf leaf){
        result += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVisitor {
    
    long result = 1;
    final int M=1000000007;
    
    @Override
    public int getResult() {
        return (int) result;
    }
    
    @Override
    public void visitNode(TreeNode node) {
        
        if (node.getColor() == Color.RED) {
            result = (result * node.getValue()) % M;
        }
    }
    
    @Override
    public void visitLeaf(TreeLeaf leaf) {
        
        if (leaf.getColor() == Color.RED) {
            result = (result * leaf.getValue()) % M;
        }
    }
}

class FancyVisitor extends TreeVisitor {
    
    int even = 0;
    int green = 0;
    
    @Override
    public int getResult(){
        return Math.abs(even - green);
    }
    
    @Override
    public void visitNode(TreeNode node){
        
        if (node.getDepth() % 2 == 0) {
            even += node.getValue();
        }
    }
    
    @Override
    public void visitLeaf(TreeLeaf leaf) {
        
        if (leaf.getColor() == Color.GREEN) {
            green += leaf.getValue();
        }
    }
}

class Solution {
    
    static int values[];
    static Color colors[];
    static Map<Integer, Set<Integer>> nodesMap = new HashMap<>();
    
    public static Tree solve() {
        
        Scanner scanner = new Scanner(System.in);
        int nnodes = scanner.nextInt();
        
        values = new int[nnodes];
        for (int i = 0; i < nnodes; i++) {
            values[i] = scanner.nextInt();
        }
        
        colors = new Color[nnodes];
        for (int i = 0; i < nnodes; i++) {
            colors[i] = (scanner.nextInt() == 0) ? Color.RED : Color.GREEN;
        }
        
        Tree rootNode;
        if (nnodes == 1) {
            rootNode = new TreeLeaf(values[0], colors[0], 0);
        } else {
            rootNode = new TreeNode(values[0], colors[0], 0);
            for (int i = 0; i < (nnodes - 1); i++) {
                int u = scanner.nextInt();
                int v = scanner.nextInt();
                
                Set<Integer> uEdges = nodesMap.get(u);
                if (uEdges == null) {
                    uEdges = new HashSet<>();
                }
                uEdges.add(v);
                nodesMap.put(u, uEdges);
                
                Set<Integer> vEdges = nodesMap.get(v);
                if (vEdges == null) {
                    vEdges = new HashSet<>();
                }
                vEdges.add(u);
                nodesMap.put(v, vEdges);
            }
            
            for (int nodeId : nodesMap.get(1)) {
                nodesMap.get(nodeId).remove(1);
                createEdge(rootNode, nodeId);
            }
        }
        return rootNode;
    }
    
    private static void createEdge(Tree parent, int nodeId) {
        
        Set<Integer> nodeEdges = nodesMap.get(nodeId);
        if (nodeEdges != null && !nodeEdges.isEmpty()) {
            TreeNode node = new TreeNode(values[nodeId - 1], colors[nodeId - 1], parent.getDepth() + 1);
            ((TreeNode) parent).addChild(node);
            for (int neighborId : nodeEdges) {
                nodesMap.get(neighborId).remove(nodeId);
                createEdge(node, neighborId);
            }
        } else {
            TreeLeaf leaf = new TreeLeaf(values[nodeId - 1], colors[nodeId - 1], parent.getDepth() + 1);
            ((TreeNode) parent).addChild(leaf);
        }
    }

    public static void main(String[] args) {
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Tree root = solve();
        
        SumInLeavesVisitor sumInLeavesVisitor = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor productOfRedNodesVisitor = new ProductOfRedNodesVisitor();
        FancyVisitor fancyVisitor = new FancyVisitor();
        
        root.accept(sumInLeavesVisitor);
        root.accept(productOfRedNodesVisitor);
        root.accept(fancyVisitor);
        
        int sumResult = sumInLeavesVisitor.getResult();
        int productRessult = productOfRedNodesVisitor.getResult();
        int fancyResult = fancyVisitor.getResult();
        
        System.out.println(sumResult);
        System.out.println(productRessult);
        System.out.println(fancyResult);
    }
}