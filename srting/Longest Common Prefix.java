class Solution {
    public String longestCommonPrefix(String[] strs) {
        String re=strs[0];
        for(String s:strs){
            String r="";
            int i=0;
            while((re.length()>i&&i<s.length()&&s.charAt(i)!='\0')&&(re.charAt(i)==s.charAt(i))){
                r+=re.charAt(i);
                i++;
            }
            re=r;
        }
        return re;
    }
}