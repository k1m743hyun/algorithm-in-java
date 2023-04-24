package org.thkim0022.code;

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String operation : operations) {
            if (operation.charAt(0) == 'X') {
                if (operation.charAt(1) == '+') {
                    x += 1;
                } else {
                    x -= 1;
                }
                
            } else {
                if (operation.charAt(0) == '+') {
                    x += 1;
                } else {
                    x -= 1;
                }
            }
        }
        return x;
    }
}