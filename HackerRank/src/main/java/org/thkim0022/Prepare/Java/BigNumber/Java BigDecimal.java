import java.math.BigDecimal;
import java.util.*;

class Solution {
  
    public static void main(String[] args) {
      
        // Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n+2];
        for(int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        // Write your code here
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String arg0, String arg1) {
                // TODO Auto-generated method stub
                if (arg0 == null || arg0.trim().length() == 0 || arg1 == null || arg1.trim().length() == 0) {
                    return 0;
                }
                return new BigDecimal(arg1).compareTo(new BigDecimal(arg0));
            }
        });

        // Output
        for (int i = 0; i < n; i++)
        {
            System.out.println(s[i]);
        }
    }
}