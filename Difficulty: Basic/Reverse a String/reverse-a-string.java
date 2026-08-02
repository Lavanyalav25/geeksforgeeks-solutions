class Solution {
    public static String reverseString(String s) {
        // code here
     // User function Template for Java


          StringBuilder rev = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            rev.append(s.charAt(i));
        }

        return rev.toString();
    
    }
}   
    