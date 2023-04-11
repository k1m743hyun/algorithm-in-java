import java.io.*;
import java.util.*;
interface PerformOperation {
 boolean check(int a);
}
class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }

   // Write your code here
   PerformOperation isOdd() {
       return p -> p % 2 != 0;
   }
   
   PerformOperation isPrime() {
       return p -> {
           for (int i = 2; i <= p / 2; i++) {
               if (p % i == 0) return false;
            }
            return true;
        };
   }
   
   PerformOperation isPalindrome() {
       return p -> {
           String strNum = Integer.toString(p);
           int j = strNum.length() - 1;
            for (int i = 0; i < strNum.length() / 2; i++, j--) {
                if (strNum.charAt(i) != strNum.charAt(j)) {
                    return false;
                }
            }
            return true;
       };
   }
}

public class Solution {

 public static void main(String[] args) throws IOException {
  MyMath ob = new MyMath();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  PerformOperation op;
  boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.isOdd();
    ret = ob.checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.isPrime();
    ret = ob.checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.isPalindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }
}
