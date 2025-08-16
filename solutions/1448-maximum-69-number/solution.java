class Solution {
    public int maximum69Number (int num) {
        int arr[] = new int[5];
        int i=4;
        while(num > 0) {
            int dig = num % 10;
            arr[i--] = dig;
            num /= 10;
        }
        int res = 0;
        boolean isSixFlipped = false; 
        for(int j : arr) {
            if(!isSixFlipped && j == 6) {
                res = res*10 + 9;
                isSixFlipped = true;
            } else {
                res = res*10 + j;
            }
        }
        return res;
    }
}
