class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> sm = new HashMap<>();
        for(char c:s.toCharArray()) {
            sm.put(c, sm.getOrDefault(c, 0)+1);
        }
        for(int i=0; i<t.length(); i++) {
            char c = t.charAt(i);
            if(sm.get(c) != null) {
                if(sm.get(c) == 1) {
                    sm.remove(c);
                } else {
                    sm.put(c, sm.getOrDefault(c, 0)-1);
                }
            }
        }
        if(sm.isEmpty()) return true;
        return false;
    }
}
