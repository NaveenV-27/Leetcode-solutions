class Solution {
    public int maximumLengthSubstring(String str) {
        int n = str.length();
        int map[] = new int[26];
        int s = 0, e = 0;
        int max = 0;
        for(e=0; e<n; e++) {
            map[str.charAt(e) - 'a']++;
            while(map[str.charAt(e) - 'a'] > 2) {
                map[str.charAt(s) - 'a']--;
                s++; 
            }
            max = Math.max(e - s + 1, max);
        } 
        return max;
    }
}
