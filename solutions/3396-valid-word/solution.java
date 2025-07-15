class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) {
            return false;
        }
        word = word.toLowerCase();
        String vowels = "aeiou";
        int v = 0, c = 0;
        for(char ch : word.toCharArray()) {
            int ascii = (int)ch;
            System.out.println(ascii + " " + ch);
            if(ch < 'a') {
                if(ch < '0' || ch > '9') return false;
            } else if (ch > 'z') return false; 
            if(vowels.contains(ch+"")) {
                v++;
            } else if(ch < '0' || ch > '9') {
                c++;
            }
        }
        System.out.println(v + " " + c);
        if(v == 0 || c == 0) return false;
        return true;
    }
}
