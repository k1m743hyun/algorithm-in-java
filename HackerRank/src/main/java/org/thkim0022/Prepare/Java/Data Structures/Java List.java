import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine();
        
        ArrayList<Integer> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        
        int q = scanner.nextInt();
        scanner.nextLine();
        
        String command = "";
        for (int j = 0; j < q * 2; j++) {
            if (j % 2 == 0) {
                command = scanner.nextLine();
            } else {
                if (command.equals("Insert")) {
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    
                    arr.add(x, y);
                } else if (command.equals("Delete")) {
                    int x = scanner.nextInt();
                    
                    arr.remove(x);
                }
                if (j != q * 2 - 1) {
                    scanner.nextLine();
                }
            }
        }
        
        scanner.close();
        
        for (int k = 0; k < arr.size(); k++) {
            System.out.printf("%d ", arr.get(k));
        }
    }
}