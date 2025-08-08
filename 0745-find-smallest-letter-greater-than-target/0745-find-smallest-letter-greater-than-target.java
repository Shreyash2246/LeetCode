class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int s = 0, e = n-1;

        while(s <= e){
            int mid = s + (e-s) / 2;

            if(target < letters[mid]){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }

        return letters[s % n];
    }
}