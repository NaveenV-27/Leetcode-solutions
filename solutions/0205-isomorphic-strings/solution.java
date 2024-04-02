class Solution {
    public boolean isIsomorphic(String s, String t) {
        int sMap[] = new int[200];
        int tMap[] = new int[200];
        int len = s.length();
        for(int i=0; i<len; i++) {
            if(sMap[s.charAt(i)] != tMap[t.charAt(i)]) {
                return false;
            }
            sMap[s.charAt(i)] = i+1;
            tMap[t.charAt(i)] = i+1;
        }
        return true;
    }
}
