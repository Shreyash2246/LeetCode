class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1, n=nums.length;
        int i=0;

        while(i < n-1){
            
            int j = i+1;
            if(nums[i] == nums[j]){
                i++;
                j++;
            }else{
                nums[k++]=nums[j++];
                i++;
            }
        }

        return k;
    }
}