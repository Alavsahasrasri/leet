class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int ans[] = new int[2];
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int num : nums){
            mp.put(num, mp.getOrDefault(num,0)+1);
        }
        for(int i=1;i<=n;i++){
            if(mp.containsKey(i)){
                if(mp.get(i) == 2){
                    ans[0] = i;
                }
            }
                else{
                    ans[1]=i;
                }
            
        }
        return ans;
    }
}