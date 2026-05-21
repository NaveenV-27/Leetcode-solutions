class Solution {
    private int size(int n) {
        return (n+"").length();
    }
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for(int i : arr1) {
            int k = i;
            while(k > 0) {
                map.put(k, 1);
                k /= 10;
            }
        }
        for(int i : arr2) {
            int k = i;
            while(k > 0) {
                if(map.containsKey(k)) {
                    res = Math.max(res, size(k));
                }
                k /= 10;
            }
        }
        return res;
    }
}
