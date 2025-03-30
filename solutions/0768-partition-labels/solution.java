class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> l = new ArrayList<Integer>();
        int min = 0;
        int max = 0;
        for(int i=0; i<s.length(); i++) { 
            if(i > max) {
                l.add(max-min+1);
                min = i;
            }
            char ch = s.charAt(i);
            max = Math.max(max, s.lastIndexOf(ch));
        }
        l.add(max-min+1);
        return l;
    }
}
