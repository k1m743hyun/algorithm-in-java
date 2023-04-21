class Solution {

    public int[] leftRigthDifference(int[] nums) {
        
        int nums_len = nums.length;

        int[] leftSum = new int[nums_len];
        int ls = 0;
        for (int i = 0; i < nums_len; i++) {
            leftSum[i] = ls;
            ls += nums[i];
        }

        int[] rightSum = new int[nums_len];
        int rs = 0;
        for (int j = nums_len - 1; j >= 0; j--) {
            rightSum[j] = rs;
            rs += nums[j];
        }

        int[] answer = new int[nums_len];
        for (int k = 0; k < nums_len; k++) {
            answer[k] = Math.abs(leftSum[k] - rightSum[k]);
        }

        return answer;
    }
}