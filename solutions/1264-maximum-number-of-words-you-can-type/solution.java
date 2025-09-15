class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String arr[] = text.split(" ");
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            count += 1;
            for(char ch : arr[i].toCharArray()) {
                if(brokenLetters.contains(ch+"")) {
                    count -= 1;
                    break;
                }
            }
        }
        return count;
    }
}
