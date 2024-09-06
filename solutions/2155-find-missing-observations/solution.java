class Solution {
    private int[] generateArr(int n, int k) {
        if(k < n || k>6*n) {
            return new int[0];
        }
        int arr[] = new int[n];
        Arrays.fill(arr, 1);
        k -= n;
        int i = 0;
        while(k>0) {
            if(arr[i] < 6) {
                arr[i]++;
                k--;
            } else i++;
        }
        return arr;
    }
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum = 0;
        int m = rolls.length;
        for(int i: rolls) {
            sum += i;
        }
        sum = mean*(m+n)-sum;
        return generateArr(n, sum);
    }
}
