class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n = s1.length();
        int diff = 0;
        int f = -1;
        int l = -1;
        for(int i=0; i<n && diff<=2; i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                diff++;
                if(diff > 2) return false;
                if(f < 0) {
                    f = i;
                } else {
                    l = i;
                }
            }
        }
        if(diff == 1) return false;
        if(diff == 2) {

            return (s1.charAt(f) == s2.charAt(l) && s1.charAt(l) == s2.charAt(f));
        } else return true;
    }
}
