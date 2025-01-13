class Solution {
    public int minimumLength(String s) {
        int map[] = new int[26];
        for(char ch : s.toCharArray()) {
            map[ch-'a']++;
        }
        int l = 0;
        for(int i : map) {
            if(i >= 3) {
                if(i % 2 == 0) l += 2;
                else l += 1;
            } else {
                l += i;
            }
        }
        return l;
    }
}
