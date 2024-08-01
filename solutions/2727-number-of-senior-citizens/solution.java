class Solution {
    public int countSeniors(String[] dets) {
        int count = 0;
        for(String s: dets) {
            int age = (s.charAt(11) - '0') * 10 + (s.charAt(12) - '0');
            if(age > 60) count++;

        }
        return count;
    }
}
