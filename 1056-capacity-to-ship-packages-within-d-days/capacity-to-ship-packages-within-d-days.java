class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0;
        int h =0;
        for(int w : weights){
            l = Math.max(l,w);
            h += w;
        }
        while(l<h){
            int mid = l+(h-l)/2;
            int cr = 0;
            int da = 1;
            for(int w : weights){
                if(cr+w > mid ){
                    da++;
                    cr =0;
                }
                cr += w;
            }
            if(da > days){
                l = mid+1;
            }
            else{
                h = mid;
            }
        }
        return l;
    }
}