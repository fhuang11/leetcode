package P5LongestPalindromicSubstring;

import java.util.ArrayList;
import java.util.List;

class Solution1 {
    public String longestPalindrome(String s) {
        if (s.length() == 0)
            return "";
        List<int[]> palindromes = initPalindromes(s);
        for (int r = 0; r < s.length() / 2 + 1; r++) {
            List<int[]> newPalindromes = new ArrayList<>();
            for (int[] p : palindromes) {
                int si = p[0] - 1;
                int ei = p[1] + 1;
                if (si >= 0 && ei < s.length() && s.charAt(si) == s.charAt(ei)) {
                    newPalindromes.add(new int[] { si, ei });
                }
            }
            if (newPalindromes.size() == 0)
                break;
            palindromes = newPalindromes;
        }
        int[] lp = palindromes.get(0);
        return s.substring(lp[0], lp[1] + 1);
    }

    private List<int[]> initPalindromes(String s) {
        List<int[]> palindromes = new ArrayList<>();
        // single character strings
        // blank strings ex 'abc'
        // 1, 0 -> 0, 1 ('ab')
        // 2, 1 -> 1, 2 ('bc')
        for (int i = 0; i < s.length(); i++) {
            palindromes.add(new int[] { i, i });
            if (i != 0)
                palindromes.add(new int[] { i, i - 1 });
        }
        return palindromes;
    }
}
