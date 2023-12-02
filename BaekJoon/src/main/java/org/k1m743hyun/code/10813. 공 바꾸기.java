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
        for (int x = 0; x < n; x++) {
            answer[x] = x + 1;
        }

        for (int y = 0; y < m; y++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();

            int temp = answer[i - 1];
            answer[i - 1] = answer[j - 1];
            answer[j - 1] = temp;
        }

        // output
        for (int z : answer) {
            System.out.println(z);
        }
    }
}