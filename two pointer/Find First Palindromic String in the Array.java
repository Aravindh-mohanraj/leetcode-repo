class Solution {
    public boolean pal(String s){
        String re="";
        for(int i=s.length()-1;i>=0;i--){
            re+=s.charAt(i);
        }
        return (s.equals(re));
    }
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(pal(words[i]))return words[i];
        }
        return "";
    }
}