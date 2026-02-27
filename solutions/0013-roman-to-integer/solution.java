class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int num = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        boolean last = true;
        for(int i=0; i<n-1; i++) {
            int fir = map.get(s.charAt(i));
            int sec = map.get(s.charAt(i+1));
            if(fir >= sec) {
                num += fir;
            } else {
                num += (sec - fir);
                i++;
                if(i == n-1) last = false;
            }
            // System.out.println(i + ": " + num);
        }
        if(last) {
            num += map.get(s.charAt(n - 1));
        }

        return num;
    }
}
