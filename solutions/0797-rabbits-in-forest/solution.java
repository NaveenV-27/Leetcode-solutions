class Solution {
    public int numRabbits(int[] answers) {
        int map[] = new int[1000];
        int count = 0;
        for(int i : answers) {
            map[i]++;
            if(map[i] > (i+1)) {
                map[i] = 1;
            }
            if(map[i] == 1) {
                count += (i+1);
            }
        }
        return count;
    }
}
