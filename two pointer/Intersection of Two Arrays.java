class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> n1=new HashSet<>();
        HashSet<Integer> n2=new HashSet<>();
        for(int x : nums1)n1.add(x);
        for(int x:nums2)n2.add(x);
        ArrayList<Integer> list=new ArrayList<>();
        for(int x:n2){
            if(n1.contains(x)){
                list.add(x);
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}