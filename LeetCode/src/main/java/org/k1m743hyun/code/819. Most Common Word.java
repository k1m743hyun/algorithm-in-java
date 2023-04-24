class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        // 소문자로 변환
        paragraph = paragraph.toLowerCase();

        // 문자 외 나머지 공백 처리
        paragraph = paragraph.replaceAll("[^a-z]+", " ");

        // 공백 여러 개 하나로 합치고 앞뒤 공백 삭제
        paragraph = paragraph.replaceAll("[ ]{2,}", " ").trim();
        //System.out.println(paragraph);

        // 공백으로 단어 나누기
        String[] words = paragraph.split(" ");
        //System.out.println(Arrays.toString(words));

        // 단어가 하나면 그 단어 바로 리턴
        int words_len = words.length;
        if (words_len == 1) {
            return words[0];
        }

        // ban 제외 단어 갯수 세어 가장 많이 사용된 단어 리턴
        Map<String, Integer> resultMap = new HashMap();
        int maxValue = 0;
        String maxKey = "";
        for (String word: words) {
            if (!Arrays.asList(banned).contains(word)) {
                if (!resultMap.containsKey(word)) {
                    resultMap.put(word, 1);
                } else {
                    resultMap.put(word, resultMap.get(word) + 1);
                }
                int val = resultMap.get(word);
                if (val > maxValue) {
                    maxValue = val;
                    maxKey = word;
                }
            }
        }
        //System.out.println(resultMap.toString());
        //System.out.println(maxValue);
        //System.out.println(maxKey);

        return maxKey;
    }
}