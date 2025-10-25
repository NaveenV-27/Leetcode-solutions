class Solution {
    public int totalMoney(int n) {
        if(n<7) {
            int sum = 0;
            for(int i=1; i<=n; i++) sum +=i;
            return sum;
        }
       int d = n / 7;
       int r = n % 7;
       int prevWeeks = 28*d + 7 * (d* (d-1)/2); 
       int curr = r*d + (r*(r+1)/2);
       return prevWeeks + curr;
    
    }
}
