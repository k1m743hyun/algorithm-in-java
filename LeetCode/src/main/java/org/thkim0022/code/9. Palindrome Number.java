class Solution {
    public boolean isPalindrome(int x) {
        
        if (x < 0) {
            return false;
        } else if (x < 10) {
            return true;
        } else {
            String[] s = String.valueOf(x).split("");
            int s_len = s.length;
            for (int i = 0; i < s_len / 2; i++) {
                if (!s[i].equals(s[s_len - 1 - i])) {
                    return false;
                }
            }
            return true;
        }
    }
}