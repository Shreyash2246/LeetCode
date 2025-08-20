class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int i = 0;

        while (i < n) {
            if (nums[i] != i + 1) {
                int correctIdx = nums[i] - 1;

                if (nums[i] != nums[correctIdx]) {
                    swap(nums, i, correctIdx);
                } else {
                    // duplicate found
                    // if we not return here then i will going to infinite. 
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1; // ideally never reached
    }

    static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
