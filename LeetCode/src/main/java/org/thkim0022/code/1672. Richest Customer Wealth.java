class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int accounts_len = accounts.length;
        int[] results = new int[accounts_len];
        for (int i = 0; i < accounts_len; i++) {
            results[i] = Arrays.stream(accounts[i]).sum();
        }

        return Arrays.stream(results).max().getAsInt();
    }
}