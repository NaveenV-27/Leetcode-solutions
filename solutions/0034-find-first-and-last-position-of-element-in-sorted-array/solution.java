class Solution {
    private int first(int[] arr, int t) {
        int first = -1;
        int l = 0, r = arr.length-1;
        while(l <= r) {
            int mid = (l+r)/2;
            if(arr[mid] == t) {
                first = mid;
                r = mid - 1;
            }
            if(arr[mid] < t) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return first;
    }
    private int last(int[] arr, int t) {
        int last = -1;
        int l = 0, r = arr.length-1;
        while(l <= r) {
            int mid = (l+r)/2;
            if(arr[mid] == t) {
                last = mid;
                l = mid + 1;
            }
            else if(arr[mid] < t) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {
        return new int[]{first(nums, target), last(nums, target)};
    }
}
