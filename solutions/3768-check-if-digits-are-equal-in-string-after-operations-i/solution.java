class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length() > 2) {
            StringBuilder sb = new StringBuilder();
            int n = s.length();
            for(int i=1; i<n; i++) {
                int newDig = (int)(s.charAt(i) + s.charAt(i-1)) % 10;
                sb.append(newDig);
                System.out.println(newDig);
            }
            s = sb.toString();
        }
        System.gc();
        if(s.length() == 2 && s.charAt(0) == s.charAt(1)) {
            return true;
        }
        return false;
    }
}
