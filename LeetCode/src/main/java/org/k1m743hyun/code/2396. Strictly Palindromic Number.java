class Solution {
    public boolean isStrictlyPalindromic(int n) {

        for (int i = 2; i < n - 1; i++) {
            String[] strBin = Integer.toString(n, i).split("");
            int strBin_len = strBin.length;
            for (int j = 0; j < (strBin_len / 2) + 1; j++) {
                if (!strBin[j].equals(strBin[strBin_len - 1 - j])) {
                    return false;
                }
            }
        }
        return true;
    }
}