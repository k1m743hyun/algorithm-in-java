package org.thkim0022.code;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len_nums = nums.length;
        int[] result = new int[len_nums];
        for (int i = 0; i < len_nums; i++) {
            int cnt = 0;
            for (int j = 0; j < len_nums; j++) {
                if (j != i && nums[j] < nums[i]) {
                    cnt += 1;
                }
            }
            result[i] = cnt;
        }
        return result;
    }
}