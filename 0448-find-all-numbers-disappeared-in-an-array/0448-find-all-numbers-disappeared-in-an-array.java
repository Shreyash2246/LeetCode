class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //same as problem 268
        int n = nums.length;

        int i = 0;
        while(i < n){
            int correctIdx = nums[i]-1; 

            if(nums[i] != nums[correctIdx]){
                swap(nums, i, correctIdx);
            }else{
                i++;
            }
        }

        List<Integer> list = new ArrayList<>();
        for(i = 0; i<n; i++){
            if(nums[i] != i+1){
                list.add(i+1);
            }
        }

        return list;
    }

    static void swap(int[] arr, int one, int two){
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}