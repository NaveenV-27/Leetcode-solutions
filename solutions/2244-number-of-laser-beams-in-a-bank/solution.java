class Solution {
    public int numberOfBeams(String[] bank) {
        int count = 0;
        int curr = 0;
        for(String s : bank) {
            int n = 0;
            for(char ch : s.toCharArray()) {
                if(ch=='1') n++;
            }
            if(n>0) {
                count += curr * n;
                curr = n;
            }
        }
        return count;
    }
}
