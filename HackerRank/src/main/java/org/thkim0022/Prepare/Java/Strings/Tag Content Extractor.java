import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
	public static void main(String[] args) {
    
    Pattern pattern = Pattern.compile("<(.+)>([^<>]+)</(\\1)>");
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases-- > 0) {
			String line = in.nextLine();
      Matcher matcher = pattern.matcher(line);
      if (matcher.find()) {
        matcher.reset();
        while (matcher.find()) {
          System.out.println(matcher.group(2));
        }
      } else {
        System.out.println("None");
      }
		}
    in.close();
	}
}