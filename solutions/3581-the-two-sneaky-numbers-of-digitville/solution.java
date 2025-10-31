class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int res[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        int k = 0;
        for(int i : nums) {
            int count = map.getOrDefault(i, 0);
            if(count >= 1) {
                res[k++] = i;
                if(k > 1) {
                    break;
                }
            } else {
                map.put(i, count+1);
            }
        } 
        return res;
    }
}
