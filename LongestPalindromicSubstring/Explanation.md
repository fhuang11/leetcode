# Longest Palindromic Substring Problem Explanation

A string is a palindrome if the each ith character for N/2 characters is equal to (N-i)th character. For a string with an odd number of characters, the middle character can be any character.

## Brute Force Solution
Check every possible substring to see if the substring is a palindrome. This solution has O(N^3) time complexity because every combination of start and end index must be checked and it take O(N) time to check every character of substring. The space complexity is O(1).

This algorithm can be slightly improved by starting with the original string and recursively checking for all substrings of size N-1. That way we can stop once the first and longest palindromic substring is found.

## Solution 1: Bottom Up Dynamic Programming
In the brute force approach the algorithm is checking the same characters multiple time, instead let's break the problem down into subproblems. Every blank string is a palindrome and every character is a palindrome. We can use existing palindromic strings to build the new palindrome if the previous and next character are equal.

Time complexity O(N^2) with pruning of non palindromic substrings. Space complexity O(N^2).

**Recursion?**
Does not seem much more difficult to code non-recursively which has better performance.

**Memoization**
Could use memoization to look up if certain substring values already checked if a string contains repeated substrings. This would use O(N^2) space for every starting and ending index.

## Solution 2: Improve DP to Use Constant Space
Find the longest palindromic string for each base case. Return the longest string.

## Manacher's Algorithm 
O(N) time complexity. Read up on this algorithm.