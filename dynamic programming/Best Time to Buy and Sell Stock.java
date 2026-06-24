class Solution {
    public int maxProfit(int[] prices) {
        int minp=999999;
        int mp=0;
        for(int p:prices){
            if(p<minp){
                minp=p;
            }else{
                mp= Math.max(mp,p-minp);
            }
        }
        return mp;
    }
}