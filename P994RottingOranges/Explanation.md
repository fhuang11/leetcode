# Rotting Oranges Problem Explanation
Let's start by simulating which oranges are rotten at each minute. Every minute, all oranges adjacent to a rotten orange will become rotten.

## Solution 1
1. Initialize the step as 0.
2. First find all the oranges that are initially rotten.
3. Then for each minute, find all oranges adjacent to rotten oranges that have started rotting.
4. Set rotten oranges to rotting oranges. Only the oranges that rotted in current minute matter because previously rotted oranges have already rotted all adjacent oranges.
5. Mark rotting oranges as rotten in grid.
6. When rotten oranges can rot no more adjacent oranges, stop checking for rotting oranges.
7. Increment the step by 1.
8. Check if there are any Fresh Oranges remaining. If yes, return -1, otherwise return step.

This solution has O(N) time complexity because every orange is checked 3 times; once to find initially rotten oranges, once to find adjacent rotting oranges, and lastly to find remaining fresh oranges.

This solution has O(N) space complexity. In the worst case, every orange in grid is initially rotten, then the collection of rotten oranges will contain N oranges.