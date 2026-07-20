class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int result[] = new int[2*n];

        int i=0;
        while(i<n){
            result[i]= nums[i];
            result[i+n]=nums[i];
            i++;
        }

        return result;
        
    }
}