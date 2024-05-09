class Solution {
    public String[] findRelativeRanks(int[] score) {

        int n = score.length;
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0; i<n; i++) {
            l.add(score[i]);
        }
        Arrays.sort(score);
        String[] res = new String[n];
        res[l.indexOf(score[n-1])] = "Gold Medal";
        if(n>=2) res[l.indexOf(score[n-2])] = "Silver Medal";
        if(n>=3) res[l.indexOf(score[n-3])] = "Bronze Medal";
        for(int i=n-4, j=4; i>=0; i--, j++) {
            res[l.indexOf(score[i])] = j+"";
        }
    return res;


    }
} 
