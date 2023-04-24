package org.thkim0022.code;

import java.util.ArrayList;

class Solution {
    public int[] decompressRLElist(int[] nums) {
        int freq = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                freq = nums[i];
            } else {
                for (int j = 0; j < freq; j++) {
                    temp.add(nums[i]);
                }
            }
        }

        int len = temp.size();
        int[] result = new int[len];
        for (int k = 0; k < len; k++) {
            result[k] = temp.get(k);
        }

        return result;
    }
}