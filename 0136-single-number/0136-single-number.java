class Solution {
    public int singleNumber(int[] nums) {
        int xOr = 0;

        for(int num : nums){
            xOr ^= num;
        }

        return xOr;
    }
}