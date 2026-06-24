class Solution {
    public String reverseWords(String s) {
        String[] a=s.trim().split("\\s+");
        int i = 0;
        int j=a.length-1;
        while(i<j){
            String o=a[j];
            a[j--]=a[i];
            a[i++]=o;
        }
        return String.join(" ",a).trim();
    }
}