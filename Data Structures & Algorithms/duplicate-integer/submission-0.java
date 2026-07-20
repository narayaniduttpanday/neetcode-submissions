class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int itr: nums){
            st.add(itr);
        }

        if(st.size()<nums.length){
            return true;
        }
        else{
            return false;
        }
    }
}