class Solution {
        public static int solve(int i,int pc,int arr[][],int dp[][]){
                if(i==arr.length){
                            return 0;
                                    }
                                            if(dp[i][pc]!=-1) return dp[i][pc];
                                                    int min=Integer.MAX_VALUE;
                                                            for(int j=0;j<arr[i].length;j++){
                                                                        if(j==pc) continue;
                                                                                    min=Math.min(min,arr[i][j]+solve(i+1,j,arr,dp));
                                                                                            }
                                                                                                    return dp[i][pc]=min;
                                                                                                        }
                                                                                                            public int minFallingPathSum(int[][] arr) {
                                                                                                                    int dp[][] = new int[arr.length+1][arr.length+1];
                                                                                                                            for(int each_Row[]:dp) Arrays.fill(each_Row,-1);
                                                                                                                                    return solve(0,arr.length,arr,dp);   
                                                                                                                                        }

}

      


