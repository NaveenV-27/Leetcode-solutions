class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        int wait[] = new int[n];
        int currTime = customers[0][0];
        for(int i=0; i<n; i++) {
            if(customers[i][0] > currTime) currTime = customers[i][0];
            currTime += customers[i][1];
            wait[i] = currTime - customers[i][0];
        }
        double avg = 0;
        for(int i: wait) {
            avg += i;
        }
        avg /= n;
        return avg;
    }
}
