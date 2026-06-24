class Solution {
    public void rotate(int[] nums, int k){
        if (k > nums.length) {
            k %= nums.length;
        }
        int[] ar=nums.clone();
        int j=0;
        for(int i=nums.length-k;i<nums.length;i++)nums[j++]=ar[i];
        for(int i=0;i<nums.length-k;i++){
            nums[j++]=ar[i];
        }
    }
}