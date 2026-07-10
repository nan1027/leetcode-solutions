class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int maxArea=0;
        while(l<r){
           int width=r-l;
           int currentArea=Math.min(height[l],height[r])*width;
           maxArea=Math.max(maxArea,currentArea);

           if(height[l]>height[r]){
              r--;
           }
           else{
              l++;
           }
        }
        return maxArea;
    }
}