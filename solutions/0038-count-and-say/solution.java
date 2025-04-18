class Solution {
    private String rle(String s) {
        if(s.equals("1")) return "11";
        int n = s.length();
        int count = 1;
        StringBuilder newStr = new StringBuilder();
        for(int i=1; i<n; i++) {
            if(s.charAt(i) != s.charAt(i-1)) {
                newStr.append(count + "" + s.charAt(i-1));
                count = 1;
            } else {
                count++;
            }

        }
        newStr.append(count + "" + s.charAt(n-1));
        System.gc();
        return newStr.toString();
    }
    public String countAndSay(int n) {
        if(n == 1) return "1";
        return rle(countAndSay(n-1));
    }
}
