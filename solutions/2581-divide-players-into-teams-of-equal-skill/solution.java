class Solution {
    public long dividePlayers(int[] skill) {
        int sum = 0, n=skill.length;
        for(int i:skill) {
            sum += i;
        }
        Arrays.sort(skill);
        int s = 0, e = n-1;
        long chemistry = 0;
        while(s<e) {
            int f = skill[s++];
            int l = skill[e--];
            if(f+l == 2*sum/n) {
                int p = f*l;
                chemistry += p;
            }
            else return -1;
        }
        return chemistry;
    }
}
