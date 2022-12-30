import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try {
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            scanner.close();

            System.out.println(x / y);
        } catch(InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch(ArithmeticException e) {
            System.out.println(e);
        }
    }
}
