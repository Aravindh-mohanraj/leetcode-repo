class Solution {
    public int[] sortByBits(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(Integer.bitCount(arr[i])>Integer.bitCount(arr[j])&&i!=j){
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
                else if(Integer.bitCount(arr[i])==Integer.bitCount(arr[j])&&i!=j){
                    if(arr[i]>arr[j]){
                        int t=arr[i];
                        arr[i]=arr[j];
                        arr[j]=t;
                    }
                }
            }
        }
        return arr;
    }
}