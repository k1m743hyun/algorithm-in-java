class Solution {
    public int minimumSum(int num) {

        int[] numList = new int[4];
        for (int i = 0; i < 4; i++) {
            int base = (int) Math.pow(10, 3 - i);
            numList[i] = (int) (num / base);
            num = num % base;
        }
        Arrays.sort(numList);


        int new1 = 0;
        int new2 = 0;
        for (int j = 0; j < 4; j++) {
            if (j < 2) {
                if (j % 2 == 0) {
                    new1 = numList[j] * 10;
                } else {
                    new2 = numList[j] * 10;
                }
            } else {
                if (j % 2 == 0) {
                    new1 = new1 + numList[j];
                } else {
                    new2 = new2 + numList[j];
                }
            }
        }

        return new1 + new2;
    }
}