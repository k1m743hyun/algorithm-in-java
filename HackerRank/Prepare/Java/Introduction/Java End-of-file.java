import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int idx = 0;
        
        while(sc.hasNext()) {
            System.out.printf("%d %s\n", ++idx, sc.nextLine());
        }
    }
}