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

        int duplicate = 0;
        for(i = 0; i < n; i++){
            if(nums[i] != i+1){
                duplicate = nums[i];
            }
        }

        return duplicate;
    }

    static void swap(int[] arr, int s, int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}