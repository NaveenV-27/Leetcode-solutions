class Solution {
    public int numberOfSpecialChars(String word) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        for(char ch : word.toCharArray()) {
            if(Character.isLowerCase(ch)) {
                char upper = Character.toUpperCase(ch);
                if(map.containsKey(upper)) {
                    if(map.get(upper) == -1) continue;
                    count++;
                    map.put(upper, -1);
                    map.put(ch, -1);
                } else {
                    map.put(ch, 1);
                }
            } else {
                char lower = Character.toLowerCase(ch);
                if(map.containsKey(lower)) {
                    if(map.get(lower) == -1) continue;
                    count++;
                    map.put(lower, -1);
                    map.put(ch, -1);
                } else {
                    map.put(ch, 1);
                }
            }
        }
        // System.out.println(map);
        return count;
    }
}
