import java.io.*;
import java.util.*;
import java.security.*;
import javax.xml.bind.DatatypeConverter;

public class Solution {

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(s.getBytes());

            System.out.println(DatatypeConverter.printHexBinary(md.digest()).toLowerCase());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
