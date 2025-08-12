class Solution {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length-1;

        int pivot = searchPivot(nums, start, end);
        
        return nums[pivot+1];
        // while(start < end){
        //     int mid = start + (end - start) / 2;
        //     // 4 casses to find pivot and return pivot immidiate next element becaose its going to be minimum in whole array.
        //     // or either you can directly set conditions to find min element as like set for pivot.
        //     // there are four cases
        //     if(mid > start  && nums[mid] > nums[mid+1]){
        //         return mid+1;
        //     }else if(mid > end && nums[mid] < nums[mid-1]){
        //         return mid;
        //     }else if(nums[mid] >= nums[end]){
        //         start = mid;
        //     }else{
        //         end = mid-1;
        //     }
        // }

        // return -1;
    }

    static int searchPivot(int arr[], int start, int end){

        while(start <= end){
            int mid = start + (end - start) / 2;

            // there are four cases
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }else if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }else if(arr[mid] <= arr[start]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        return -1;
    }
}