class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.length()==0) {
            return 0;
        }
        int sign = 1;
        int i=0;
        int num = 0;
        if(s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if(s.charAt(i) == '+') {
            i++;
        }
        while(i<s.length() && Character.isDigit(s.charAt(i))) {
            int dig = s.charAt(i) - '0';
            if(num > (Integer.MAX_VALUE - dig)/10) {
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            num = num*10 + dig;
            i++;
        }
        return num*sign;

    }
}
