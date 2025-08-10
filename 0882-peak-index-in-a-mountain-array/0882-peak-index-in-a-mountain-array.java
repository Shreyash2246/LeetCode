class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s = 0, e = arr.length-1;

        while(s < e){
            int mid = s + (e-s) / 2;

            if(arr[mid] > arr[mid+1]){
                // means we are in decreasing part of array.
                e = mid;
            }else{
                // we are in increasing part of array.
                // here we do mid + 1 because if we do mid to both conditions.
                // our loop will not get volated and it's time will get axceed. 
                s = mid + 1;
            }
        }

        return s;
    }
}