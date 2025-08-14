class Solution {
    public int splitArray(int[] nums, int k) {
        int sum = 0, max = nums[0];
        for(int num : nums){
            sum += num;
            max = Math.max(num, max);
        }

        return potentialAns(nums, k, max, sum);
    }

    static int potentialAns(int[] arr, int m, int start, int end){

        while(start < end){
            int pieces = 1;
            int mid = start + (end - start) / 2;

            int sum = 0;
            for(int num : arr){

                if(sum + num <= mid){
                    sum += num;
                }else{
                    sum = num;
                    pieces++;
                }
            }

            if(pieces <= m){
                end = mid;
            }else{
                start = mid+1;
            }
        }

        return start;
    }
}