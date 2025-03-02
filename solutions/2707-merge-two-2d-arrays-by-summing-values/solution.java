class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums1.length; i++) {
            int num[] = nums1[i];
            map.put(num[0], map.getOrDefault(num[0], 0) + num[1]);
        }
        for(int i=0; i<nums2.length; i++) {
            int num[] = nums2[i];
            map.put(num[0], map.getOrDefault(num[0], 0) + num[1]);
        }
        int res[][] = new int[map.size()][2];
        int i = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            res[i][0] = e.getKey(); 
            res[i++][1] = e.getValue(); 
        }
        Arrays.sort(res, (a, b) -> a[0]-b[0]);
        return res;    
    }
}
