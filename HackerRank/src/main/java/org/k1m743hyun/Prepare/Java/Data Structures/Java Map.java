//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();

            map.put(name, phone);
        }

        while(in.hasNext()) {
            String s = in.nextLine();
            Integer phone = map.get(s);
            if (phone != null) {
                System.out.printf("%s=%d\n", s, map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}