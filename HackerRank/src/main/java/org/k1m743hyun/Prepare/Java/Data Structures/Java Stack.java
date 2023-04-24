import java.util.*;

class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            // Complete the code
            String[] strings = input.split("");
            System.out.println(isBalanced(strings));
        }
    }

    public static boolean isBalanced(String[] strings) {

        Stack<String> stack = new Stack<>();
        for (String string: strings) {
            if ("(".equals(string) || "{".equals(string) || "[".equals(string)) {
                stack.push(string);
            } else if (")".equals(string) || "}".equals(string) || "]".equals(string)) {
                if (stack.isEmpty()) {
                    return false;
                }
                String top = stack.pop();
                if ((")".equals(string) && !"(".equals(top)) || ("}".equals(string) && !"{".equals(top)) || ("]".equals(string) && !"[".equals(top))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}