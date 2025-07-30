class Solution {
    public void moveZeroes(int[] nums) {
        int k=0, n=nums.length;

        int i=0;
        while(i < n){
            if(nums[i]==0){
                i++;
            }else{
                nums[k]=nums[i];
                i++;
                k++;
            }
        }
        
        while(k < n){
            nums[k++]=0;
        }
    }
}