class Solution {
    private int sumOfDigits(int n) {
        int sum = 0;
        while(n > 0) {
            sum += (n%10);
            n /= 10;
        }
        return sum;
    }
    public int countLargestGroup(int n) {
        int map[] = new int[37];
        for(int i=1; i<=n; i++) {
            map[sumOfDigits(i)]++;
        }
        Arrays.sort(map);
        int count = 1;
        for(int i=35; map[i+1]==map[i]; i-- ) {
            count++;
        }
        return count;
    }
}
