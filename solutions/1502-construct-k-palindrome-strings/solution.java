class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length() < k) {
            return false;
        }
        int map[] = new int[26];
        for(char ch : s.toCharArray()) {
            map[ch-'a']++;
        }
        int c = 0;
        for(int i=0; i<26; i++) {
            if(map[i] % 2 != 0) {
                c++;
            }
        }
        return (c>k)? false : true; 
    }
}
