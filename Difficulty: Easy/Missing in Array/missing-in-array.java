class Solution {
    int missingNum(int arr[]) {
     long sum = 0;
        long n = arr.length + 1;
        for (int num : arr) {
            sum += num;
        }
        long total = n * (n + 1) / 2;
        long missingnumber = total - sum;
        return (int) missingnumber;
    }
}