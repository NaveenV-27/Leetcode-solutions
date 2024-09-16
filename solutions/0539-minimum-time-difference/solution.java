class Solution {
    private int timeInMins(String s) { 
        int h = Integer.parseInt(s.substring(0,2));
        int m = Integer.parseInt(s.substring(3));
        return h*60 + m;
    }
    public int findMinDifference(List<String> times) {
        int n = times.size();
        int minutes[] = new int[n];
        for(int i=0; i<n; i++) {
            String time = times.get(i);
            minutes[i] = timeInMins(time);
        }
        Arrays.sort(minutes);
        int min = Integer.MAX_VALUE;
        for(int i=1; i<n; i++) {
            min = Math.min(min, minutes[i]-minutes[i-1]);
        }

        return Math.min(
            min, 
            1440 - minutes[n-1] + minutes[0]
        );


    }
}
