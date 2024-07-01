class Solution {
    static boolean isOdd(int n) {
        return n%2 != 0;
    }
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            if(isOdd(arr[i]) && i+2<arr.length) {
                if(isOdd(arr[i+1]) && isOdd(arr[i+2])) return true;
                else i++;
            } 
        }
        return false;
    }
}
