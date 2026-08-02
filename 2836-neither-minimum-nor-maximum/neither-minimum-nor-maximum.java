class Solution {
    public int findNonMinOrMax(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(nums[i],max);
            min = Math.min(nums[i],min);
        }
        for(int i: nums){
            if(i>min && i<max){
                return i;
            }
        }
        return -1;
        
    }
}