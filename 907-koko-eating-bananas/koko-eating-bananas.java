class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int hi = 0;
        for(int p : piles){
            hi = Math.max(hi,p);
        }
        while(l < hi){
            int m = l+(hi-l)/2;
            long ho = 0;
            for(int p : piles){
                ho+=(p+m-1)/m;
            }
            if(ho<= h){
                hi = m;
            }
            else{
                l = m+1;
            }
        }
        return l;
    }
}