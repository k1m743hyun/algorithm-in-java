class Solution {
    public int[] runningSum(int[] nums) {
        int num_len = nums.length;
        int[] result = new int[num_len];
        int sum = 0;
        for (int i = 0; i < num_len; i++) {
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }
}