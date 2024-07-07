class Solution {
    public int numWaterBottles(int num, int ex) {
        int count = num;
        while(num >= ex) {
            count += num/ex;
            num = (num%ex) + (num/ex);
        }
        return count;
    }
}
