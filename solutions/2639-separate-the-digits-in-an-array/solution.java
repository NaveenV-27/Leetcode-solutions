class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for(int i : nums) {
            sb.append(i);
        }
        String s = sb.toString();
        int n = s.length();
        int[] res = new int[n];
        for(int i=0; i<n; i++) {
            res[i] = s.charAt(i) - 48;
        }
        return res;
    }
}
