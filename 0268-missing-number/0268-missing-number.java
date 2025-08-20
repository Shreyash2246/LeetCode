class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;      

        int i = 0;
        while(i < n){

            int correctIdx = nums[i];
            if(nums[i] < n && nums[i] != nums[correctIdx]){
                //swap
                int temp = nums[i];
                nums[i] = nums[correctIdx];
                nums[correctIdx] = temp;
            }
            else{
                i++;
            }
        }

        for(i=0; i<n; i++){
            if(nums[i] != i){
                return i;
            }
        }

        return n;
    }
}