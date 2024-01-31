class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int res[] = new int[temp.length];
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<res.length; i++) {
            while(!s.isEmpty() && temp[s.peek()] < temp[i]) {
                res[s.peek()] = i - s.pop();
            }
            s.push(i);
        }
        return res;
    }
}
