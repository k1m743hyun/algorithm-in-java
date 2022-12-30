package org.thkim0022.code;

class Solution {
    public int subtractProductAndSum(int n) {
        int len = (int) Math.log10(n) + 1;
        int pod = 1;
        int sod = 0;
        for (int i = 0; i < len; i++) {
            int temp = n % 10;
            pod = pod * temp;
            sod = sod + temp;
            n = n / 10;
        }
        return pod - sod;
    }
}