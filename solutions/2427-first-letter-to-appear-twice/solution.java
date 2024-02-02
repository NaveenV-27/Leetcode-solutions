class Solution {
    public char repeatedCharacter(String s) {
        boolean map[] = new boolean[26];
        for(int i=0; i<s.length(); i++) {
            if(map[s.charAt(i) - 'a']) {
                return s.charAt(i);
            }
            map[s.charAt(i) - 'a'] = true;
        }
        return 'a';
    }
}
