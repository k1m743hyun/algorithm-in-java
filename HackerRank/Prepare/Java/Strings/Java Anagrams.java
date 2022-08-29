import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) {
            return false;
        }
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        if (a.compareTo(b) == 0) {
            return true;
        }
        
        char[] arr_a = a.toCharArray();
        char[] arr_b = b.toCharArray();
        
        java.util.Arrays.sort(arr_a);
        java.util.Arrays.sort(arr_b);
        
        return java.util.Arrays.equals(arr_a, arr_b);
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
