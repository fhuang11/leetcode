package P5LongestPalindromicSubstring;

public class Debug {
    public static void main (String[] args) {
        Solution2 solution = new Solution2();

        System.out.print("The longest palindrome in abcba should be abcba and is: ");
        System.out.print(solution.longestPalindrome("abcba"));
        System.out.println("");

        System.out.print("The longest palindrome in abba should be abba and is: ");
        System.out.print(solution.longestPalindrome("abba"));
        System.out.println("");

        final String s3 = "jglknendplocymmvwtoxvebkekzfdhykknufqdkntnqvgfbahsljkobhbxkvyictzkqjqydczuxjkgecdyhixdttxfqmgksrkyvopwprsgoszftuhawflzjyuyrujrxluhzjvbflxgcovilthvuihzttzithnsqbdxtafxrfrblulsakrahulwthhbjcslceewxfxtavljpimaqqlcbrdgtgjryjytgxljxtravwdlnrrauxplempnbfeusgtqzjtzshwieutxdytlrrqvyemlyzolhbkzhyfyttevqnfvmpqjngcnazmaagwihxrhmcibyfkccyrqwnzlzqeuenhwlzhbxqxerfifzncimwqsfatudjihtumrtjtggzleovihifxufvwqeimbxvzlxwcsknksogsbwwdlwulnetdysvsfkonggeedtshxqkgbhoscjgpiel";
        System.out.print("The longest palindrome in long string should be sknks and is: "); // not "zttz"
        System.out.print(solution.longestPalindrome(s3));
        System.out.println("");
    }
}