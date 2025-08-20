class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;

        int i = 0;
        while(i < n){
            int correctIdx = nums[i] - 1;

            if(nums[i] != nums[correctIdx]){
                swap(nums, i, correctIdx);
            }else{
                i++;
            }
        }

        for(i = 0; i < n; i++){
            if(nums[i] != i+1){
                return nums[i];
            }
        }

        return nums[0];
    }

    static void swap(int[] arr, int s, int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}