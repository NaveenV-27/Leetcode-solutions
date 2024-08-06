class Solution {
    private static HashMap<Character, Integer>
    sortByValue(HashMap<Character, Integer> hm)
    {
        List<Map.Entry<Character, Integer> > list
            = new LinkedList<Map.Entry<Character, Integer> >(
                hm.entrySet());
 
        Collections.sort(
            list,
            (i1,
             i2) -> i1.getValue().compareTo(i2.getValue()));
 
        HashMap<Character, Integer> temp
            = new LinkedHashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
    public int minimumPushes(String word) {
        int n = word.length();
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch:word.toCharArray()) {
            if(map.containsKey(ch)) map.put(ch, map.get(ch)+1);
            else map.put(ch, 1);
        }
        int k = map.size();
        if(k < 8) return n;
        Map<Character, Integer> hm = sortByValue(map);
        int i = 0;
        for(Map.Entry<Character, Integer> e : hm.entrySet()) {
            if(k>24) {
                ans += e.getValue()*4;
            }
            else if(k>16) {
                ans += e.getValue()*3;
            } else if(k > 8) ans += e.getValue()*2;
            else ans += e.getValue();
            k--;
        }
        return ans;
    }
}
