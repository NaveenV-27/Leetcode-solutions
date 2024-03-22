class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double med;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i:nums1) {
            a.add(i);
        }
        for(int i:nums2) {
            a.add(i);
        }
        Collections.sort(a);
        int n = a.size();
        if(n % 2 == 0) {
            med = (a.get(n/2) + a.get((n/2)-1));
            med /= 2;
        } else {
            med = a.get(n/2);
        }
        return med;
    }
}
