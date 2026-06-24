class Solution {
    public int lengthOfLastWord(String s) {
        int a=s.length(),c=0;
        for(int i=a - 1;i>=0;i--){
            if(s.charAt(i)==' ')a--;
            else break;
        }
        for(int i=a - 1;i>=0;i--){
            if(s.charAt(a-1)==' '&&i!= a- 1)continue;
            if(s.charAt(i)!=' ')c++;
            else break;
        }
        return c;
    }
}