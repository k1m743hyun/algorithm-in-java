import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Prime prime = new Prime();
        String number;
        while ((number = bufferedReader.readLine()) != null) {
            prime.checkPrime(Integer.parseInt(number));
        } 
    }
}

class Prime {
    
    ArrayList<Integer> results = new ArrayList<>();
    int loopCnt = 0;
    
    void checkPrime(int num) {
        
        loopCnt++;
        int factorCnt = 0;
        boolean isPrime = false;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factorCnt++;
            }
            
            if (factorCnt == 2) {
                isPrime = true; 
            } else if (factorCnt > 2) {
                isPrime = false;
                break;
            }
        }
        
        if (isPrime) {
            results.add(num);
        }
        
        if (loopCnt != 4) {
            printResult();
        }
    }
    
    void printResult() {
        for (Integer result : results) {
            System.out.print(result + " ");
        }
        System.out.println();
    }
}
