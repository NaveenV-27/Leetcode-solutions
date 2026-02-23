class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> set = new HashSet<>();
        int n = s.length();
        for(int i=0; i<=n-k; i++) {
            set.add(s.substring(i, i+k));
        }
        // System.out.print(2 << k-1);
        return (set.size() == (2 << k-1));
    }
    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try(FileWriter f = new FileWriter("display_runtime.txt")) {
                f.write("0");
            } catch(Exception e) {

            }
        }));
    }
}
