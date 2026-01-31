class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char res = Character.MAX_VALUE;
        boolean found = false;
        for(char letter : letters) {
            if(letter < res && letter > target) {
                res = letter;
                found = true;
            }
        }
        return found ? res : letters[0];
    }
}
