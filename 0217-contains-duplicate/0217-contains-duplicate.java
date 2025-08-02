class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        int n = nums.length;
        HashMap<Integer, Integer> H = new HashMap<>();

        int i=0;
        while(i<n){
            if(H.containsKey(nums[i])){
                return true;
            }else{
                H.put(nums[i],i);
            }
            i++;
        }

        return false;
    }
}