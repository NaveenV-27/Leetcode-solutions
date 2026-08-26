class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        int l=0, r=0;
        int count = 0, min = Integer.MAX_VALUE;
        String res = "";
        while(l <= r && r<n) {
            if(s.charAt(r) == '1') count++;
            while(count == k) {
                int len = r - l + 1;
                String sub = s.substring(l, r+1);
                if(len < min) {
                    // System.out.println("changing res to: " + sub);
                    res = sub;
                    min = len;
                } 
                else if(len == min && (res.compareTo(sub) > 0)) {
                    // System.out.println("changing res to: " + sub );
                    res = sub;
                }
                if(s.charAt(l) == '1') count--;
                l++;
            }
            r++;
        }
        return res;
    }
}
