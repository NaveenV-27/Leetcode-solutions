class Solution {
    public boolean makeEqual(String[] words) {
        if(words.length == 1) {
            return true;
        }
        int map[] = new int[26];
        for(String s:words) {
            for(char c:s.toCharArray()) {
                map[c-'a']++;
            }
        }
        int n = words.length;
        for(int i:map) {
            if(i%n != 0) {
                return false;
            }
        }
        return true;
    }
}
