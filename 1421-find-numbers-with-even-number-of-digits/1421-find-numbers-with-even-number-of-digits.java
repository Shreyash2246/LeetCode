class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for(int num : nums){
            if((even(num)%2)==0){
                count++;
            }
        }

        return count;
    }

    static int even(int num){
        
        if(num < 0){
            num = num * -1;
        }
        
        return (int)(Math.log10(num)) + 1;
    }
}