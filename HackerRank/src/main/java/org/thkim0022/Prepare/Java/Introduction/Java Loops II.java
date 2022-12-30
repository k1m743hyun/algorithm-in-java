import java.util.*;
import java.io.*;
import java.math.*;

class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int temp = a;
            int[] result = new int[n];
            for (int j = 0; j < n; j++) {
                temp += Math.pow(2, j) * b;
                result[j] = temp;
                System.out.print(temp + " ");
            }
            System.out.println("");
        }
        in.close();
    }
}
