class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int c1 = 0, c2 = 0;
        for(int i=0; i<n; i++) {
            if(i%2 == 1) {
                if(s.charAt(i) != '1') {
                    c1++;
                } else {
                    c2++;
                }
            } else {
                if(s.charAt(i) != '0') {
                    c1++;
                } else {
                    c2++;
                }
            }
        }
        // for(int i=0; i<n; i++) {
        //     if(s1.charAt(i) != s.charAt(i)) {
        //         c1++;
        //     }
        //     if(s2.charAt(i) != s.charAt(i)) {
        //         c2++;
        //     }
        // }
        // System.out.println(s1);
        // System.out.println(s2);
        return Math.min(c1, c2);
    }
}
