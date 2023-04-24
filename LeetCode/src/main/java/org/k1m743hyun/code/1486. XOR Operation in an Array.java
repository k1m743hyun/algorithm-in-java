class Solution {
    public int xorOperation(int n, int start) {

        int result = 0;
        for (int i = 0; i < n; i++) {
            int temp = start + (i * 2);
            if (i == 0) {
                result = temp;
            } else {
                result = result ^ temp;
            }
        }
        return result;
    }
}