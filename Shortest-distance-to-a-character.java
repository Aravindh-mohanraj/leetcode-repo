class Solution {
    public int[] shortestToChar(String s, char ch){
        int[] ar=new int[s.length()];
        char[] c=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(c[i]==ch)ar[i]=0;
            else{
                int l=i-1,r=i+1;
                while(l>=0&&c[l]!=ch){
                    l--;
                }
                while(r<s.length()&&c[r]!=ch){
                    r++;
                }
                if(l<0){
                    ar[i]=r-i;
                }
                else if(r>=s.length())ar[i]=i-l;
                else{
                    ar[i]=Math.min(Math.abs(r-i),Math.abs(l-i));
                }
            }
        }
        return ar;
    }
}