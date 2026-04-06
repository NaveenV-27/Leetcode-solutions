class Solution {
    public boolean judgeCircle(String moves) {
        if(moves.length() % 2 != 0) return false;
        int[] map = new int[26];
        for(char ch : moves.toCharArray()) {
            map[ch-'A']++;
        }
        return ((map['U' - 'A'] == map['D'-'A']) && (map['R'-'A'] == map['L'-'A']));
    }
}
