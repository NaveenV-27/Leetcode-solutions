class Solution {
    public String[] sortPeople(String[] names, int[] hgts) {
        int n = names.length;
        for(int i=0; i<n-1; i++) {
            int l = i;
            for(int j=i+1; j<n; j++) {
                if(hgts[j] > hgts[l]) l= j;
            }
            int t = hgts[i];
            hgts[i] = hgts[l];
            hgts[l] = t;
            String tmp = names[i];
            names[i] = names[l];
            names[l] = tmp;
        }
        return names;
    }
}
