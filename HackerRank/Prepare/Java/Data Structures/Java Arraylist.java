import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Integer>[] arrayList = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            arrayList[i] = new ArrayList<Integer>();
            for (int j = 0; j < d; j++) {
                int temp = scanner.nextInt();
                Integer element = new Integer(temp);
                arrayList[i].add(element);
            }
        }
        //System.out.println(Arrays.deepToString(arrayList));

        int q = scanner.nextInt();
        for (int k = 0; k < q; k++) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;

            if (arrayList[x].size() != 0) {
                if (y < arrayList[x].size()) {
                    System.out.println(arrayList[x].get(y));
                } else {
                    System.out.println("ERROR!");
                }
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}