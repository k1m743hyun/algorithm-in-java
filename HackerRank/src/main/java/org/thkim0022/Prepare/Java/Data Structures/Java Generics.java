import java.io.*;
import java.util.*;


//class Arr <T> {
//    public <T> void printArray(T[] arr) {
//        for (T a: arr) {
//            System.out.println(a);
//        }
//    }
//}

//public class Solution {
public class Solution <T> {

    public <T> void printArray(T[] arr) {

      for (T a: arr) {
          System.out.println(a);
      }
    }

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //Arr arr = new Arr();
        Solution solution = new Solution<>();
        
        Integer[] a = {1, 2, 3};
        //arr.printArray(a);
        solution.printArray(a);
        
        String[] b = {"Hello", "World"};
        //arr.printArray(b);
        solution.printArray(b);
    }
}
