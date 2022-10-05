import java.io.*;
import java.util.*;


class Arr <T> {
    public <T> void printArray(T[] arr) {
        for (T a: arr) {
            System.out.println(a);
        }
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Arr arr = new Arr();
        
        Integer[] a = {1, 2, 3};
        arr.printArray(a);
        
        String[] b = {"Hello", "World"};
        arr.printArray(b);
    }
}
