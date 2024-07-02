class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> l = new ArrayList<>();
        int p1 = 0, p2 = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(p1<nums1.length && p2<nums2.length) {
            if(nums1[p1] == nums2[p2]) {
                l.add(nums1[p1]);
                p1++;
                p2++;
            } else if(nums1[p1]<nums2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }
        int nums[] = new int[l.size()];
        for(int i=0; i<l.size(); i++) {
            nums[i] = l.get(i);
        }
        return nums;
    }
}
