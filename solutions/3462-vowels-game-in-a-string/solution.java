class Solution {
    public boolean doesAliceWin(String s) {
        String vowels = "aeiou";
        for(char ch : s.toCharArray()) {
            switch (ch){
                case 'a', 'e', 'i', 'o', 'u': return true;
            }
        }
        return false;
    }
}
