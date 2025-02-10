class Solution {
    public String clearDigits(String s) {
        int n = s.length();
        Stack<Integer> li = new Stack<>();
        int map[] = new int[n];
        for(int i=0; i<n; i++) {
            if(s.charAt(i) - '0' <= 9) {
                map[i] = 1;
                int idx = li.pop();
                map[idx] = 1;
            } else {
                li.add(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            if(map[i] == 0) {
                sb.append(s.charAt(i) + "");
            }
        }
        return sb.toString();
    }
}
