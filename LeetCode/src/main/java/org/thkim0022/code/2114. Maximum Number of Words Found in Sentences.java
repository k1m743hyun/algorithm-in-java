package org.thkim0022.code;

class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        
        for (int i = 0; i < sentences.length; i++) {
            int len = sentences[i].split(" ").length;
            
            if (max < len) {
                max = len;
            }
        }
        
        return max;
    }
}