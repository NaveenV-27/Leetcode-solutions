class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int landTime = Integer.MAX_VALUE;
        int m = landDuration.length;
        int n = waterDuration.length;
        for(int i=0; i<m; i++) {
            int time = landStartTime[i] + landDuration[i];
            landTime = Math.min(time, landTime);
        }
        // System.out.println(landTime);
        int minLandTime = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            int time = landTime;
            if(landTime < waterStartTime[i]){
                time = waterStartTime[i] + waterDuration[i];
            } 
            else time += waterDuration[i];
            minLandTime = Math.min(minLandTime, time);
        }
        // System.out.println(minLandTime);

        int waterTime = Integer.MAX_VALUE;

        for(int i=0; i<n; i++) {
            int time = waterStartTime[i] + waterDuration[i];
            waterTime = Math.min(time, waterTime);
        }
        // System.out.println(waterTime);
        int minWaterTime = Integer.MAX_VALUE;
        for(int i=0; i<m; i++) {
            int time = waterTime;
            if(waterTime < landStartTime[i]){
                time = landStartTime[i] + landDuration[i];
            } 
            else time += landDuration[i];
            minWaterTime = Math.min(minWaterTime, time);
        }
        // System.out.println(minWaterTime);

        return Math.min(minWaterTime, minLandTime);

    }
}
