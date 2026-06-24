class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> al=new HashMap<>();
        int m=0,c=0;
        for(int i=0;i<nums.length;i++){
            al.put(nums[i],al.getOrDefault(nums[i],0)+1);
        }
        for(int i:al.keySet()){
            if(al.get(i)>m){
                m=al.get(i);
                c=i;
            }
        }
        return c;
    }
}