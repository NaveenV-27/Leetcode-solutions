class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        for(int i: nums1) {
            s1.add(i);
        }
        HashSet<Integer> s2 = new HashSet<>();
        int size = 0;
        for(int i:nums2) {
            s2.add(i);
        }
        for(int num: s1) {
            if(s2.contains(num)) {
                size++;
            }
        }
        int res[] = new int[size];
        int j = 0;
        for(int i: s1) {
            if(s2.contains(i)) {
                res[j++] = i;
            }
        }
        return res;

    }
}
