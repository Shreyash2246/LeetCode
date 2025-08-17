class Solution {
    public int mySqrt(int x) {
        if(x < 2) return x;

        return findLessMid(x);
    }

    static int findLessMid(int x){
        //we'll find our answer between 0 - x/2;
        int start = 1, end = x/2;
        int ans = 1;

        while( start <= end ){
            int mid = start + (end - start) / 2;

            if(mid <= x / mid){
                ans = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        return ans;
    }
}