class Solution {
    public int[] sortedSquares(int[] nums) {
        //brute force approach:-
        // time complexity= O(n log n);space complexity=O(1);
        // for(int i=0;i<nums.length;i++){
        //     nums[i]= nums[i]*nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;

        // optimal approach

        int head=0;
        int tail=nums.length-1;
        int[] ans= new int[nums.length];
        int index= nums.length-1;
        while(head<=tail){
            if(Math.abs(nums[head])>Math.abs(nums[tail])){
                ans[index]=nums[head]*nums[head];
                head++;
            }
            else{
                ans[index]=nums[tail]*nums[tail];
                tail--;
            }
            index--;
        }
        return ans;
    }
}