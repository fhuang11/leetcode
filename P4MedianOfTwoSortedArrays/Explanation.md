
Solution 0:
Copy elements of two arrays into one array. Then return the median element/elements. 

The median element for the odd case is the (length1 + length2)/2 + 1. 
Ex index 1 for array of 3.

The median case fof the even case is the average of (length1 + length2)/2 - 1 + (length1 + length2)/2.
Ex index 1 and 2 for array of 4.

O(N) time and O(N) space complexity.

Solution 1:
Improve on Solution 0 by avoding creating a copy of all elements.

O(N) time and O(1) space complexity.

Solution 2;
Think about using binary search to get O(logN) time complexity.
