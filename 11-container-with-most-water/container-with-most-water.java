class Solution {
    public int maxArea(int[] height) {
        int l =0,r=height.length-1;
        int mA = 0;
        while(l<r){
            int w = r-l;
            int h = Math.min(height[l],height[r]);
            int a = h*w;
            mA= Math.max(mA,a);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return mA;
    }
}