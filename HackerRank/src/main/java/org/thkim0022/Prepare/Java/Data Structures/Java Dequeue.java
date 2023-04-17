    import java.util.*;
    
    public class test {
        
        public static void main(String[] args) {
            
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int m = in.nextInt();

            Deque<Integer> deque = new ArrayDeque<>();
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                deque.add(num);
            }
            
            int maxUniqueCounts = 0;
            while (deque.size() > m - 1) {
                List<Integer>subNumList = new ArrayList<>(deque).subList(0, m);
                int uniqueCount = new HashSet<>(subNumList).size();
                if (maxUniqueCounts < uniqueCount) {
                    maxUniqueCounts = uniqueCount;
                }
                deque.removeFirst();
            }
            System.out.println(maxUniqueCounts);
        }
    }



