class Solution {
    public int maxArea(int[] h) {
        int i=0,j=h.length-1,m=0;
        while(i<j){
            int mx=((h[i]>h[j])?h[j]:h[i])*(j-i);
            if(mx>m)m=mx;
            if(h[i]>h[j])j--;
            else i++;
        }
        return m;
    }
}