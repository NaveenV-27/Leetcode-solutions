class Solution {
    public int maxDiff(int num) {
        String s = String.valueOf(num);
        Set<Character> unq = new HashSet<>();
        for(char ch : s.toCharArray()) {
                unq.add(ch);
        }
        int max = num, min = num;
        for(char digit: unq) {
            for(char c = '0'; c<='9'; c++ ) {
                if(s.charAt(0) == digit && c == '0') continue;
                String numStr = s.replace(digit, c);
                int newNum = Integer.parseInt(numStr);
                max = Math.max(max, newNum);
                min = Math.min(min, newNum);
            }
        }
        return max - min;
    }
}
