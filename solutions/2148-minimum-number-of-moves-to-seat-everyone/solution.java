class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int count = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        int n = seats.length;
        for(int i=0; i<n; i++) {
            count += Math.abs(students[i] - seats[i]);
        }
        return count;
    }
}
