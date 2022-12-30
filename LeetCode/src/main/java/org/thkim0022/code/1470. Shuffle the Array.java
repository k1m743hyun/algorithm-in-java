package org.thkim0022.code;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = nums[i];
        }
        
        int[] y = new int[n];
        for (int j = 0; j < n; j++) {
            y[j] = nums[n+j];
        }
        
        int[] result = new int[n*2];
        for (int k = 0; k < n*2; k++) {
            int idx = (int) k / 2;
            if (k % 2 == 0) {
                result[k] = x[idx];
            } else {
                result[k] = y[idx];
            }
        }
        
        return result;
    }
}