class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int ans = Integer.MIN_VALUE;
        for(int[] arr : accounts) {
            int sum = 0;

            for(int num : arr){
                sum += num;
            }

            ans = Math.max(ans, sum);
        }
        
        return ans;
    }
}