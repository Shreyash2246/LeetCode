class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int diff = target - nums[i];

            if(hmap.containsKey(diff)){
                return new int[] { hmap.get(diff), i };
            }

            hmap.put(nums[i], i);
        }

        return new int[] {};
    }
}