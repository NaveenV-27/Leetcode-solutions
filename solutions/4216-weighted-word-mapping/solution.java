class Solution {
    private int wordWeight(String word, int[] weights) {
        int weight = 0;

        for(char ch : word.toCharArray()) {
            weight += weights[ch-'a'];
        }
        return weight % 26;
    }
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(String word : words) {
            sb.append((char)('z' - wordWeight(word, weights)));
        } 
        return sb.toString();
    }
}
