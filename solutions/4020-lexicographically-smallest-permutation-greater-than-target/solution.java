class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int[] map = new int[26];
        for(char ch : s.toCharArray()) {
            map[ch-'a']++;
        }
        return helper(target, map, "", false, 0);
    }
    String helper(String target, int[] map, String res, boolean isGreater, int idx) {
        if(idx >= target.length()) {
            // System.out.println("Reached end");
            return isGreater ? res : "";
        }
        if((res.length() == target.length() && isGreater)) {
            return res;
        } 
        char ch = target.charAt(idx);
        if(isGreater) {
            for(char c='a'; c <= 'z'; c++) {
                if(map[c-'a'] >= 1) {
                    map[c-'a']--;
                    String result = helper(target, map, res+c, isGreater, idx+1);
                    if(result != "") {
                        // System.out.println("Is greater: " + result);
                        return result;
                    }
                    // map[i]++;
                }
            }
        } else {
            for(int i=(ch - 'a'); i<26; i++) {
                if(map[i] >= 1) {
                    if(i > (ch-'a')) isGreater = true;
                    map[i]--;
                    // System.out.println((char)(i+'a'));
                    String result = helper(target, map, res+((char)(i+'a')), isGreater, idx+1);
                    if(result != "") return result;
                    map[i]++;
                }
            }
        }
        return "";
    }
}
