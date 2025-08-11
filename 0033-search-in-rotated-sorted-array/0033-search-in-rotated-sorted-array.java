class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length-1;

        int pivot = searchPivot(nums, start, end);

        if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length-1);
        }

        if(nums[pivot] == target){
            return pivot;
        }

        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }

        return binarySearch(nums, target, pivot+1, nums.length-1);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return -1;
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