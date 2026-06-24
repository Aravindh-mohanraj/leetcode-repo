class Solution {
    public boolean isPalindrome(String s) {
        String re="";
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        int d=s.length()-1;
        for(int i=0;i<d;i++){
            if(s.charAt(i)!=s.charAt(d--)){
                return false;
            }
        }
        return true;
    }
}