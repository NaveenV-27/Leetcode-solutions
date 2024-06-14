class Solution {
    public int minIncrementForUnique(int[] arr) {
        int count = 0, max = 0, n = arr.length;
        for (int i : arr) {
            max = Math.max(i, max);
        }
        int freq[] = new int[max + n];
        for (int i : arr) {
            freq[i]++;
        }
        for (int j = 0; j < freq.length; j++) {
            if(freq[j] <= 1) continue;
            int duplicates = freq[j] - 1;
            freq[j+1] += duplicates;
            freq[j] = 1;
            count += duplicates;
        }
        return count;  
    }
}
