class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0; 
        boolean b = false;
        for(String word : words) {
            for(char c:word.toCharArray()) {
                if(!allowed.contains(c+"")) b = true;
            }
            if(!b) count++;
            b = false;
        }
        return count;
    }
}
