class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int nums_len = nums.length;
        int[] result = new int[nums_len * 2];
        for (int i = 0; i < nums_len * 2; i++) {
            result[i] = nums[i % nums_len];
        }
        return result;
    }
}