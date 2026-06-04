class Solution {

    private int waviness(int n) {
        int count = 0;
        int prev = n % 10;
        n /= 10;
        while(n > 0) {
            int curr = n % 10;
            n /= 10;
            if(n <= 0) break;
            int next = n % 10; 
            if((curr > next && curr > prev) || (curr < next && curr < prev)) count++;
            prev = curr;
        } 
        return count;
    }

    public int totalWaviness(int num1, int num2) {
        int count = 0;
        for(int i=num1; i<=num2; i++) {
            count += waviness(i);
        }
        return count;
    }
}
