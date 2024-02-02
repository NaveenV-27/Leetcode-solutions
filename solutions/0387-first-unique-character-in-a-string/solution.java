class Solution {
    public int firstUniqChar(String s) {
        boolean map[] = new boolean[26];
        for(int i=0; i<s.length(); i++) {
            if(s.lastIndexOf(s.charAt(i)) == i) {
                if(!map[s.charAt(i) - 'a']) {
                    return i;
                }
            } else {
                map[s.charAt(i) - 'a'] = true;
            }
        }
        return -1;
    }
}
