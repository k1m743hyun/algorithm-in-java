import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();

        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);

        for (int i = 0; i < M; i++) {
            String[] s = scanner.nextLine().split(" ");

            if (s[0].equals("AND")) {
                if (s[1].equals("1")) {
                    if (s[2].equals("1")) {
                        B1.and(B1);
                    } else {
                        B1.and(B2);
                    }
                } else {
                    if (s[2].equals("1")) {
                        B2.and(B1);
                    } else {
                        B2.and(B2);
                    }

                }
            } else if (s[0].equals("OR")) {
                if (s[1].equals("1")) {
                    if (s[2].equals("1")) {
                        B1.or(B1);
                    } else {
                        B1.or(B2);
                    }
                } else {
                    if (s[2].equals("1")) {
                        B2.or(B1);
                    } else {
                        B2.or(B2);
                    }
                }
            } else if (s[0].equals("XOR")) {
                if (s[1].equals("1")) {
                    if (s[2].equals("1")) {
                        B1.xor(B1);
                    } else {
                        B1.xor(B2);
                    }
                } else {
                    if (s[2].equals("1")) {
                        B2.xor(B1);
                    } else {
                        B2.xor(B2);
                    }
                }
            } else if (s[0].equals("FLIP")) {
                if (s[1].equals("1")) {
                    B1.flip(Integer.parseInt(s[2]));
                } else {
                    B2.flip(Integer.parseInt(s[2]));
                }
            } else if (s[0].equals("SET")) {
                if (s[1].equals("1")) {
                    B1.set(Integer.parseInt(s[2]));
                } else {
                    B2.set(Integer.parseInt(s[2]));
                }
            }

            System.out.printf("%s %s\n", B1.cardinality(), B2.cardinality());
        }
    }
}
