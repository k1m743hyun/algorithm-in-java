class Solution {
    public int[] buildArray(int[] nums) {
        
        int nums_len =  nums.length;
        int[] result = new int[nums_len];
        for (int i = 0; i < nums_len; i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }
}