class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        return Math.max(
            robLinear(nums,0,n-2),
            robLinear(nums,1,n-1)
        );
    }
    public int robLinear(int[] nums,int start,int end){
        if(start==end) return nums[start];
        int prev2=nums[start];
        int prev=Math.max(nums[start],nums[start+1]);
        for(int i=start+2;i<=end;i++){
            int pick=nums[i]+prev2;
            int notPick=prev;
            int current= Math.max(pick,notPick);

            prev2=prev;
            prev=current;
        }
        return prev;
    }
}