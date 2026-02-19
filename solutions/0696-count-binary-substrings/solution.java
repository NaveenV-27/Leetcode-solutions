class Solution {
    public int countBinarySubstrings(String s) {
        int count = 0, z = 0, o = 0;
        char curr = s.charAt(0);
        if(curr == '1') o++;
        else z++;
        for(int i=1; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == curr) {
                if(ch == '1') {
                    o++;
                    if(z >= o) {
                        count++;
                    }
                } else {
                    z++;
                    if(o >= z) {
                        count++;
                    }
                }
            } else {
                if(ch == '1') {
                    o = 1;
                    if(z >= o) {
                        count++;
                    }
                } else {
                    z = 1;
                    if(o >= z) {
                        count++;
                    }
                }
            }
            curr = ch;
        }
        return count;
    }
}
