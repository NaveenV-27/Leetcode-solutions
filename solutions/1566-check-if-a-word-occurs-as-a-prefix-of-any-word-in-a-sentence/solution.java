class Solution {
    private boolean isPrefix(String word, String s) {
        if(word.startsWith(s)) return true;
        else return false;
    }
    public int isPrefixOfWord(String sentence, String s) {
        String words[] = sentence.split(" ");
        for(int i=0; i<words.length; i++) { 
            if(isPrefix(words[i], s)) return i+1;
        }
        return -1;
    }
}
