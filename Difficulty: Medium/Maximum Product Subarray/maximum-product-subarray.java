// class Solution {
//     int maxProduct(int[] arr) {
//         // code here
//         int max=arr[0];
//         for(int i=0;i<arr.length;i++){
//             int prod=1;
//             for(int j=i;j<arr.length;j++){
//                 prod*=arr[j];
            
//                 if(prod>max){
//                     max=prod;
                
//             }
//             }
//         }
//         return max;
//     }
// }


class Solution {
    int maxProduct(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int x = arr[i];

            if (x < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(x, max * x);
            min = Math.min(x, min * x);

            ans = Math.max(ans, max);
        }

        return ans;
    }
}