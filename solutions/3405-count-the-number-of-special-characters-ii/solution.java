class Solution {
    public int numberOfSpecialChars(String word) {
        int lower[] = new int[26];
        int upper[] = new int[26];
        Arrays.fill(lower, -1);
        Arrays.fill(upper, -1);
        int count = 0;
        for(int i=0; i<word.length(); i++) {
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch)) {
                // if(lower[Character.toLowerCase(ch) - 'a']) {

                // }
                if(upper[ch-'A'] == -1) upper[ch - 'A'] = i;
            } else {
                lower[ch - 'a'] = i;
            }
        }
        for(int i=0; i<=25; i++) {
            if(lower[i] < upper[i] && lower[i] != -1) {
                count++;
                // System.out.println((char)(i+'a'));
            }
        }
        // System.out.println(Arrays.toString(lower));
        // System.out.println(Arrays.toString(upper));
        return count;
    }
}
