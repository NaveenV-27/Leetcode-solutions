class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        String[] a1 = s1.split(" ");
        String[] a2 = s2.split(" ");
        for(String s: a1) {
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        for(String s: a2) {
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        List<String> l = new ArrayList<>();
        map.forEach((k, v) -> {
            if(v==1) {
                l.add(k);
            }
        });
        return l.toArray(String[]::new);
    }
}
