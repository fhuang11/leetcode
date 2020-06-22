class Solution2LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        if(s.length()==0) return "";
        int startIndex = 0, endIndex = 0;
        // single character strings
        // two character strings centered around ""
        // example si, ci, ei, l
        // odd:    1,   2,  3, 3 
        // even:   1,   2,  3, 4 
        for (int ci = 0; ci < s.length(); ci++) {                      
            int oddLength = longestPalindromeAroundCenter(s, ci, ci);
            int evenLength = longestPalindromeAroundCenter(s, ci, ci+1);
            int length = Math.max(oddLength, evenLength);
            if(length > endIndex - startIndex) {
                startIndex = ci - (length-1)/2;
                endIndex = ci + length/2;
            }

        }
        return s.substring(startIndex, endIndex+1);
    }
    
    public static int longestPalindromeAroundCenter(String s, int csi, int cei) {
        int si = csi, ei = cei;
        while (si >= 0 && ei < s.length() && s.charAt(si) == s.charAt(ei)) {
            si--;
            ei++;
        }
        return ei - si - 1;
    }

    public static void main (String[] args) {
        System.out.print("The longest palindrome in abcba is abcba: ");
        System.out.print(longestPalindrome("abcba"));
        System.out.println("");

        System.out.print("The longest palindrome in abba is abba: ");
        System.out.print(longestPalindrome("abba"));
        System.out.println("");

        final String s3 = "jglknendplocymmvwtoxvebkekzfdhykknufqdkntnqvgfbahsljkobhbxkvyictzkqjqydczuxjkgecdyhixdttxfqmgksrkyvopwprsgoszftuhawflzjyuyrujrxluhzjvbflxgcovilthvuihzttzithnsqbdxtafxrfrblulsakrahulwthhbjcslceewxfxtavljpimaqqlcbrdgtgjryjytgxljxtravwdlnrrauxplempnbfeusgtqzjtzshwieutxdytlrrqvyemlyzolhbkzhyfyttevqnfvmpqjngcnazmaagwihxrhmcibyfkccyrqwnzlzqeuenhwlzhbxqxerfifzncimwqsfatudjihtumrtjtggzleovihifxufvwqeimbxvzlxwcsknksogsbwwdlwulnetdysvsfkonggeedtshxqkgbhoscjgpiel";
        System.out.print("The longest palindrome in long string is sknks: "); // not "zttz"
        System.out.print(longestPalindrome(s3));
        System.out.println("");
    }
}
