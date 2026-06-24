class Solution {
    public int maximumWealth(int[][] accounts) {
        int r=accounts.length;
        int c=accounts[0].length;
        int m=0;
        for(int i=0;i<r;i++){
            int s=0;
            for(int j=0;j<c;j++){
                s+=accounts[i][j];
            }
            if(s>m)m=s;
        }
        return m;
    }
}