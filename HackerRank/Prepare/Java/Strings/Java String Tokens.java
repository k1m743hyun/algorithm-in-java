import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.trim();
        if (s.length() == 0) {
            System.out.println(0);
        } else {
            String[] sArr = s.split("[^A-Za-z]+");
            System.out.println(sArr.length);
            for (String string:sArr) {
                System.out.println(string);
            }
        }   
        scan.close();
    }
}
