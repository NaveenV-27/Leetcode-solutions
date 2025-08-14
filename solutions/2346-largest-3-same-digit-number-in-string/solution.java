class Solution {
    public String largestGoodInteger(String num) {
        for(int i=9; i>=0; i--) {
            String curr = i != 0 ? (i*100 + i*10 + i) + "" : "000";
            if(num.contains(curr)) {
                return curr;
            }
        }
        return "";
    }
}
