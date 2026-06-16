class Solution {
    public int val(char a){
        int v=0;
        switch(a){
            case 'I':
                v+= 1;
                break;
            case 'V':
                v+=5;
                break;
            case 'X':
                v+=10;
                break;
            case 'L':
                v+=50;
                break;
            case 'C':
                v+=100;
                break;
            case 'D':
                v+=500;
                break;
            case 'M':
                v+=1000;
                break;
        }
        return v;
    }
    public int romanToInt(String s) {
        char[] a=s.toCharArray();
        int v=0;
        for(int i=0;i<a.length  - 1;i++){
            int z=val(a[i]),x=val(a[i+ 1]);
            if(z>=x){
                v+=z;
            }
            else{
                v-=z;
            }
        }
        v+=val(a[a.length - 1]);
        return v;
    }
}
