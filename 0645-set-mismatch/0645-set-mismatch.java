class Solution {
    public int[] findErrorNums(int[] nums) {
        // it is solved by simple cyclic sort and finding dup. by for loop
        int n = nums.length;
        int[] arr = new int[2];
        
        // cyclic sort
        int i = 0;
        while(i < n){
            int correctIdx = nums[i]-1;

            if(nums[i] != nums[correctIdx]){
                swap(nums, i, correctIdx);
            }else{
                i++;
            }
        }

    // finding duplicate and returining with its index
        for(i = 0; i < n; i++){

            if(nums[i] != i+1){
                arr[0] = nums[i];
                arr[1] = i+1;
                return arr;
            }
        }

        return arr;
    }

    static void swap(int[] arr, int s, int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}