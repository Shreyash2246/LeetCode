/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start = 0, end = mountainArr.length() - 1;
        int peak = searchPeak(mountainArr, start, end);

        // Search in ascending part
        int leftHalf = searchPart(mountainArr, start, peak, target, true);
        if (leftHalf != -1) {
            return leftHalf;
        }

        // Search in descending part
        return searchPart(mountainArr, peak + 1, mountainArr.length() - 1, target, false);
    }

    static int searchPeak(MountainArray mountainArr, int start, int end) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    static int searchPart(MountainArray mountainArr, int start, int end, int target, boolean ascending) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int val = mountainArr.get(mid);

            if (val == target) return mid;

            if (ascending) {
                if (target < val) end = mid - 1;
                else start = mid + 1;
            } else { // descending order
                if (target > val) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;
    }
}
