package src.main.java.org.k1m743hyun.code;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        // input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // logic
        int[] answer = new int[n];

        for (int x = 0; x < m; x++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int k = scanner.nextInt();

            for(int y = i - 1; y < j; y++) {
                answer[y] = k;
            }
        }

        // output
        for (int z : answer) {
            System.out.println(z);
        }
    }
}