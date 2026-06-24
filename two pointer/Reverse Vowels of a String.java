class Solution {
    public boolean vo(char a){
        if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U'||a=='a'||a=='e'||a=='i'||a=='o'||a=='u') return true;
        return false;
    }
    public String reverseVowels(String str) {
        char[] s=str.toCharArray();
        int j=s.length-1,i=0;
        while(i<j){
            while(i<j&&!vo(s[i]))i++;
            while(i<j&&!vo(s[j]))j--;
            char c=s[i];
            s[i++]=s[j];
            s[j--]=c;
        }
        return new String(s);
    }
    
}