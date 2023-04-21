class Solution {
    public boolean isAnagram(String s, String t) {
        
        List<String> sList = new ArrayList<>(Arrays.asList(s.split("")));
        List<String> tList = new ArrayList<>(Arrays.asList(t.split("")));
        int cnt = 0;
        for (String string: sList) {
            if (tList.contains(string)) {
                tList.remove(string);
                cnt++;
            }
        }

        return (sList.size() == cnt && tList.isEmpty()) ? true : false;
    }
}