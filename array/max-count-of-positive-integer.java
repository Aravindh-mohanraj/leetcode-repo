class Solution {
    public int maximumCount(int[] nums) {
        int i=0,c=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==0)c++;
            else if(nums[i]>0){
                break;
            }
        }
        return Math.max(nums.length-i,i-c);
    }
}