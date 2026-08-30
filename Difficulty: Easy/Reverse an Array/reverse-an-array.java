class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int l=0;
        int r=arr.length-1;
        while(l<r){
           // for(int i=arr.length-1;i>=0;i--){
            int temp=arr[l];
            arr[l]=arr[r];
           arr[r]=temp;
        
        l++;
        r--;
    
    }
       // System.out.print(Arrays.toString(arr));
    }
}