package org.thkim0022.code;

import java.util.ArrayList;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        int nums_len = nums.length;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < nums_len; i++) {
            temp.add(index[i], nums[i]);
        }

        int temp_len = temp.size();
        int[] result = new int[temp_len];
        for (int j = 0; j < temp_len; j++) {
            result[j] = temp.get(j);
        }

        return result;
    }
}