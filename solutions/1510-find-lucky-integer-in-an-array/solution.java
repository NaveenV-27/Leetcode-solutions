class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        Arrays.sort(arr);
        for(int i=n-1; i>=0; i--) {
            if(map.getOrDefault(arr[i], 0) == arr[i]) return arr[i];
        }
        return -1;
    }
}
