class Solution {
    public int[] singleNumber(int[] nums) {
        
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            if(l.contains(nums[i]))  {
                l.remove(l.indexOf(nums[i]));
            } else {
                l.add(nums[i]);
            }
        }
        int sol[] = new int[2];
        sol[0] = l.get(0);
        sol[1] = l.get(1);
        return sol;
    }
}
