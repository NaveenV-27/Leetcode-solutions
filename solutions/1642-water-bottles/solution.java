class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drinked = numBottles;
        int emp = numBottles;
        int rem = emp;
        while(rem >= numExchange) {
            int exchanged = rem / numExchange;
            drinked += exchanged;
            emp = exchanged + rem % numExchange;
            rem = emp;
            // System.out.println(rem);
        }
        return drinked;
    }
}
