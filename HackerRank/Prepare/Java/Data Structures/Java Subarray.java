import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Integer> al = new ArrayList<>(n);
        for(int i = 0; i < n; i++) {
            al.add(scanner.nextInt());
        }
        
        int neg = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n+1; j++) {
                int sum = 0;
                for (int e: al.subList(i, j)) {
                    sum += e;
                }
                if (sum < 0) {
                    neg += 1;
                }
            }
        }
        
        System.out.println(neg);
    }
}
