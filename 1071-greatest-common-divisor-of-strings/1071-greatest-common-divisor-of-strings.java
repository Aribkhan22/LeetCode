class Solution {
    public String gcdOfStrings(String str1, String str2) {
         // Step 1: Check if concatenating str1 + str2 equals str2 + str1
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        
        // Step 2: Find the gcd of the lengths of the two strings
        int gcdLength = gcd(str1.length(), str2.length());
        
        // Step 3: Return the substring of str1 from 0 to gcdLength
        return str1.substring(0, gcdLength);
    }

    // Helper method to find gcd of two numbers
    private int gcd(int s, int t) {
        while (t != 0) {
            int temp = t;
            t = s % t;
            s = temp;
        }
        return s;


    }
}