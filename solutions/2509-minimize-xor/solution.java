class Solution {
    private int setBitCount(int num) {
        int count = 0;
        while(num > 0) {
            if((num & 1) == 1) count++;
            num >>= 1;

        }
        return count;
    }
    public int minimizeXor(int num1, int num2) {
        int c1 = setBitCount(num1);
        int c2 = setBitCount(num2);
        if(c1 == c2) return num1;
        int res = 0;
        if(c1 > c2) {
            int sub = 0;
            for(int i=0; c1>c2; i++) {
                int pow = (int)Math.pow(2, i);
                if((num1 & pow) > 0) {
                    sub += pow;
                    c1--;
                }
            }
            res = num1 - sub;
        } else {
            int sum = 0;
            for(int i=0; c2>c1; i++) {
                int pow = (int)Math.pow(2, i);
                if((num1 & pow) == 0) {
                    sum += pow;
                    c2--;
                }
            }
            res = num1 + sum;
        }
        return res;
    }
}
