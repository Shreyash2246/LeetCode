class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> S = new HashSet<>();

        for(int num : nums){
            if(S.contains(num)){
                return true;
            }else{
                S.add(num);
            }
        }

        return false;
    }
}