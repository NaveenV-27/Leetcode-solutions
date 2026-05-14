class Solution {
    public int[] scoreValidator(String[] events) {
        int score = 0, counter = 0;
        for(String e : events) {
            if(e.equals("W")) {
                counter++;
                if(counter >= 10) {
                    break;
                }
            } else if(e.length() == 1) {
                score += Integer.parseInt(e);
            } else {
                score += 1;
            }
        }
        return new int[]{score, counter};
    }
}
