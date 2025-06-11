class Solution {
    public int maxDifference(String s) {
        int map[] = new int[26];
        for(char ch : s.toCharArray()) {
            map[ch-'a']++;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : map) {
            if(i%2 == 1) {
                max = Math.max(i, max);
            } else if(i > 0) {
                min = Math.min(i, min);
            }
        }
        return max-min;
        
        
    }
}
