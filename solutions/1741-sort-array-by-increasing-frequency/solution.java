class Solution {
    public int[] frequencySort(int[] nums) {
        int freq[] = new int[201];
        List<Integer> l = new ArrayList<>();
        for(int i: nums) {
            freq[i+100]++;
            l.add(i);
        }
        Collections.sort(l, (a,b)->{
            return freq[a+100] == freq[b+100]? b-a: freq[a+100]-freq[b+100];
        });
        for(int i=0; i<nums.length; i++) {
            nums[i] = l.get(i);
        }
        return nums;
    }
}
