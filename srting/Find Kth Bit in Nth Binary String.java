class Solution {
    public char findKthBit(int n, int k) {
        int f=0;
        while(n>1){
            int l=(int)Math.pow(2,n)-1;
            int m=l/2+1;
            if(k==m)return(f%2==0)?'1':'0';
            if(k>m){
                k=l-k+1;
                f++;
            }
            n--;
        }
        return(f%2==0)?'0':'1';
    }
}