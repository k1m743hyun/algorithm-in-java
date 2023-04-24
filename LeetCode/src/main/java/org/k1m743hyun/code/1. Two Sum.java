class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
        int nums_len = nums.length;
        for (int i = 0; i < nums_len; i++) {
            boolean flag = false;
            for (int j = i + 1; j < nums_len; j++) {
                if (nums[j] == (target - nums[i])) {
                    result[0] = i;
                    result[1] = j;
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        return result;
    }
}