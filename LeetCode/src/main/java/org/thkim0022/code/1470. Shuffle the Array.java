class Solution {

    public int[] shuffle(int[] nums, int n) {

        int[] result = new int[n * 2];
        for (int i = 0; i < nums.length; i++) {
            result[((i % n) * 2) + (i / n)] = nums[i];
        }
        return result;
    }
}