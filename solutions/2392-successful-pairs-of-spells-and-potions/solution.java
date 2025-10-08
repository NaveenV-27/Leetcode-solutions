class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int pairs[] = new int[n];
        Arrays.sort(potions);
        for(int i=0; i<n; i++) {
            int k = 0;
            int low = 0, high = m - 1, idx = -1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if ((long) potions[mid] * spells[i] >= success) {
                    idx = mid;
                    high = mid - 1; 
                } else {
                    low = mid + 1;
                }
            }
            if(idx != -1) pairs[i] = m - idx;
        }
        return pairs;
    }
}
