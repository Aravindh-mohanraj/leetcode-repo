class Solution {
    public int[] twoSum(int[] n, int t) {
        int i=0,j=n.length-1;
        int[] ar=new int[2];
        while(i<j){
            int s=n[i]+n[j];
            if(s==t){
                ar[0]=i+1;
                ar[1]=j+1;
                break;
            }
            else if(s>t)j--;
            else i++;
        }
        return ar;
    }
}