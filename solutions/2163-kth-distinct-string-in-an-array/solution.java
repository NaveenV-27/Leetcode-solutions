class Solution {
    private static int indexOf(String s, String[] arr) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i].equals(s)) {
                return i;
            }
        }
        return -1;
    }
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String s: arr) {
            if(map.containsKey(s)) map.put(s, map.get(s)+1);
            else map.put(s,1);
        }
        List<Integer> l = new ArrayList<>();
        for(Map.Entry<String,Integer> e : map.entrySet()) {
            if(e.getValue() == 1) l.add(indexOf(e.getKey(), arr));
        }
        Collections.sort(l);
        if(l.size() < k) return "";
        return arr[l.get(k-1)];
    }
}
