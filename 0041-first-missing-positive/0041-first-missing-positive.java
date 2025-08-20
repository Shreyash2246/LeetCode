class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // simple cyclic sort
        int i = 0;
        while (i < n) {
            int correctIdx = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= n && nums[i] != nums[correctIdx]) {
                swap(nums, i, correctIdx);
            } else {
                i++;
            }
        }

        // find missing
        for (int k = 0; k < n; k++) {
            if (nums[k] != k + 1) {
                return k + 1;
            }
        }

        return n + 1; // fix
    }

    static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
