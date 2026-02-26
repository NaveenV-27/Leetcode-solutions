class Solution {
    public int numSteps(String s) {
        int l = s.length();
        int res = 0, carry = 0;
        for(int i=l-1; i>0; i--) {
            res++;
            if(s.charAt(i) - '0' + carry == 1) {
                res++;
                carry = 1;
            }
        }
        return res + carry;
    }
}
