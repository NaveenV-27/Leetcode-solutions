class Solution {
    public int maxFreqSum(String s) {
        if(s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        System.out.println(map);
        int maxV = 0, maxC = 0;
        for(char ch = 'a'; ch<='z'; ch++) {
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                maxV = Math.max(maxV, map.getOrDefault(ch, 0));
            } else {
                maxC = Math.max(maxC, map.getOrDefault(ch, 0));
            }
        }
        return maxV + maxC;
    }
}
