package src.main.java.org.k1m743hyun.code;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        // input
        Scanner scanner = new Scanner(System.in);
        int byteSize = scanner.nextInt();

        // logic
        String answer = "";
        for (int i = 0; i < byteSize / 4; i++) {
            answer += "long ";
        }
        answer += "int";

        // output
        System.out.println(answer);
    }
}