
// class Solution {
//     public int chalkReplacer(int[] chalk, int initialChalkPieces) {
//         long totalChalkNeeded = 0;
//         for (int studentChalkUse : chalk) {
//             totalChalkNeeded += studentChalkUse;
//         }
        
//         int remainingChalk = (int)(initialChalkPieces % totalChalkNeeded);
        
//         for (int studentIndex = 0; studentIndex < chalk.length; studentIndex++) {
//             if (remainingChalk < chalk[studentIndex]) {
//                 return studentIndex;
//             }
//             remainingChalk -= chalk[studentIndex];
//         }
        
//         return 0;  
//     }
// }


class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int n = chalk.length;
        long sum = 0;
        for(int i=0; i<n; i++) sum += chalk[i];
        int rem =(int)(k % sum);
        for(int i=0; i<n; i++) {
            if(rem < chalk[i]) return i;
            else rem -= chalk[i];
        }
        return 0;
    }
}
