class Solution {
    public String findSum(String s1, String s2) {

        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;

        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {

            int digit1 = 0;
            int digit2 = 0;

            if (i >= 0) {
                digit1 = s1.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                digit2 = s2.charAt(j) - '0';
                j--;
            }

            int sum = digit1 + digit2 + carry;

            result.append(sum % 10);
            carry = sum / 10;
        }

       
        result.reverse();

       
        int k = 0;
        while (k < result.length() - 1 && result.charAt(k) == '0') {
            k++;
        }

        return result.substring(k);
    }
}