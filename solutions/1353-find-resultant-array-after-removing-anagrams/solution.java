class Solution {
    private boolean areAnagrams(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(char ch : s2.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }
        for(char key : map.keySet()) {
            if(map.get(key) != 0) {
                return false;
            }
        }
        return true;
    }
    public List<String> removeAnagrams(String[] words) {
        int n = words.length;
        List<String> res = new ArrayList<>();
        res.add(words[0]);
        for(int i=1; i<n; i++) {
            if(!areAnagrams(words[i], words[i-1])) {
                res.add(words[i]);
            }
        }
        return res;
    }
}
