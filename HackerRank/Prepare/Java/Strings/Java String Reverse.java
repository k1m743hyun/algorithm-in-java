import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        /* Enter your code here. Print output to STDOUT. */
        String B = "";
        for (int i = A.length()-1; i >= 0; i--) {
            B = B + A.charAt(i);
        }
        if (B.compareTo(A) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}
