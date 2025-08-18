class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int s = 0, e = n-1;
        while(s <= e){
            ans[s] = nums[nums[s]];
            ans[e] = nums[nums[e]];

            s++;
            e--;
        }

        return ans;
    }
}