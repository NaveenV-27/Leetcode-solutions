class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<ops.length; i++) {
            if(Character.isDigit(ops[i].charAt(0))){
                s.push(Integer.parseInt(ops[i]));
            }
            else if(ops[i].charAt(0) == '-') {
                s.push(Integer.parseInt(ops[i]));
            }
            else if(ops[i].equals("+")) {
                s.push(s.peek() + s.get(s.size()-2));
            }
            else if(ops[i].equals("C")) {
                s.pop();
            } 
            else if(ops[i].equals("D")) {
                s.push(2*s.peek());
            }
        }
    int sum = 0;
    while(!s.isEmpty()) {
        sum += s.pop();
    }
    return sum;
    }
}
