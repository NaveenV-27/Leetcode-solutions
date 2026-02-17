class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> l = new ArrayList<>();
        for(int h=0; h<12; h++) {
            for(int m=0; m<60; m++) {
                int count = Integer.bitCount(h) + Integer.bitCount(m);
                if(count == turnedOn) {
                    String s = h + ":" + ((m<10)? "0"+m : m);
                    l.add(s);
                }
            }
        }
        return l;
    }
}
