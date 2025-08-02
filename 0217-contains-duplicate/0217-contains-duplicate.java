class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        
        int i=0, j=1;
        while(i < n-1){
            if(nums[i] == nums[j]){
                return true;
            }else{
                i++;
                j++;
            }
        }

        return false;
    }
}