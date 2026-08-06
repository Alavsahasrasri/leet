class Solution {
    public int smallestNumber(int n, int t) {
        for(int ans = n; ;ans++){
            int m = 1;
            int cc = ans;
            while(cc>0){
                m = m*(cc%10);
                cc = cc/10;
            }
            if(m %t == 0){
                return ans;
            }
        }
    }
}