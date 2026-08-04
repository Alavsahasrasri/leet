class Solution {
    public int minMaxGame(int[] nums) {
        int n = nums.length;
        while(n>1){
        int [] newm = new int[n/2];
        for(int i=0;i<newm.length;i++){
            if(i%2 ==0){
            newm[i]=Math.min(nums[2*i],nums[2*i+1]);
            }
            else{
                newm[i] = Math.max(nums[2*i],nums[2*i+1]);
            }
        }
        nums = newm;
        n = nums.length;
        }
        return nums[0];
    }
}