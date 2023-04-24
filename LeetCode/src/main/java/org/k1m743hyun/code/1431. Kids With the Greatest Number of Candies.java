package org.thkim0022.code;

import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>();
        for (int i = 0; i < candies.length; i++) {
            int newVal = candies[i] + extraCandies;
            
            Boolean flag = true;
            for (int j = 0; j < candies.length; j++) {
                if (newVal < candies[j]) {
                    flag = false;
                    break;
                }
            }
            result.add(flag);
        }
        return result;
    }
}