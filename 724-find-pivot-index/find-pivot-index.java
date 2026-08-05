class Solution {
    public int pivotIndex(int[] nums) {
        int ts = 0;
        for(int n:nums){
            ts+=n;
        }
        int ls = 0;
        for(int i=0;i<nums.length;i++){
            int rs = ts - ls - nums[i];
            if(rs == ls){
                return i;
            }
            ls += nums[i];
        }
        return -1;
    }
}