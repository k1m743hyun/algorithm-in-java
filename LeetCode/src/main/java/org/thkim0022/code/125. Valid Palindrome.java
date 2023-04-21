class Solution {
    public boolean isPalindrome(String s) {

        // 소문자로 변환
        s = s.toLowerCase();
        System.out.println(s);

        // 문자, 숫자 외 나머지 빈 값 처리
        s = s.replaceAll("[^a-z0-9]+" , "");
        System.out.println(s);

        // palindrome 확인
        String[] sList = s.split("");
        int sList_len = sList.length;
        for (int i = 0; i < sList_len / 2; i++) {
            if (!sList[i].equals(sList[sList_len - 1 - i])) {
                return false;
            }
        }

        return true;
    }
}