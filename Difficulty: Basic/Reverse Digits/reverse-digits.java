class Solution {
    public int reverseDigits(int n) {
        // Code here
    //    for(int i=0;i<n;i++){
    int sum=0;
         while(n!=0){
             int r=n%10;
             sum=sum*10+r;
             n=n/10;
         }   
       // }
       return sum;
    }
}

