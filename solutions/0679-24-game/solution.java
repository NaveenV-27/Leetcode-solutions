import java.util.*;

class Solution {
    public boolean judgePoint24(int[] cards) {
        List<Double> nums = new ArrayList<>();
        for (int c : cards) nums.add((double) c);
        return dfs(nums);
    }

    private boolean dfs(List<Double> nums) {
        if (nums.size() == 1) {
            return Math.abs(nums.get(0) - 24) < 1e-6;
        }

        int n = nums.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    List<Double> next = new ArrayList<>();
                    // add remaining numbers except i, j
                    for (int k = 0; k < n; k++) {
                        if (k != i && k != j) {
                            next.add(nums.get(k));
                        }
                    }

                    // Try all operations
                    for (double val : compute(nums.get(i), nums.get(j))) {
                        next.add(val);
                        if (dfs(next)) return true;
                        next.remove(next.size() - 1);
                    }
                }
            }
        }
        return false;
    }

    private List<Double> compute(double a, double b) {
        List<Double> results = new ArrayList<>();
        results.add(a + b);
        results.add(a - b);
        results.add(a * b);
        if (Math.abs(b) > 1e-6) results.add(a / b);
        return results;
    }
}

