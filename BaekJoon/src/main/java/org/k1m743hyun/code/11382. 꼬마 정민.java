package src.main.java.org.k1m743hyun.code;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        // input
        Scanner scanner = new Scanner(System.in);
        Long first = scanner.nextLong();
        Long second = scanner.nextLong();
        Long third = scanner.nextLong();

        // logic
        Long answer = first + second + third;

        // output
        System.out.println(answer);
    }
}