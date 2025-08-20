class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;

        //cyclic sort
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
        for(i = 0; i < n; i++){
            if(nums[i] != i+1){
                list.add(nums[i]);
            }
        }

        return list;
    }

    static void swap(int arr[], int s, int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp; 
    }
}