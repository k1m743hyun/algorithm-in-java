import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        // Write your code here.
        double d = scanner.nextDouble();
        scanner.nextLine();
        String s = scanner.nextLine();
        scanner.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}