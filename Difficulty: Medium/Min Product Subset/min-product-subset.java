class Solution {
    public int minProd(int[] arr) {
        int min=Integer.MAX_VALUE;
        int n=arr.length;
        for(int i=1;i<(1<<n);i++){
            int prod=1;
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                prod=prod*arr[j];
                

                }
                
            }
            if(prod<min){
            min=prod;
        }
        }
        return min;
    }
}

