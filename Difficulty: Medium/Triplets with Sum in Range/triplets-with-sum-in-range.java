import java.util.*;

class Solution {
    public long countTriplets(int[] arr, int l, int r) {
        Arrays.sort(arr);

        return countLessEqual(arr, r) - countLessEqual(arr, l - 1);
    }

    private long countLessEqual(int[] arr, int target) {
        long count = 0;
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum <= target) {
                    // Every element from left+1 to right
                    // can form a valid triplet with i and left
                    count += right - left;
                    left++;
                } else {
                    right--;
                }
            }
        }

        return count;
    }
}