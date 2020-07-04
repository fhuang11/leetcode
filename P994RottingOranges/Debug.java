package P994RottingOranges;

public class Debug {

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        final int[][] grid1 = { { 2, 1, 1 }, { 1, 1, 0 }, { 0, 1, 1 } };
        System.out.print("The time to rot oranges in grid 1 should be 4 and is: ");
        System.out.print(solution.orangesRotting(grid1));
        System.out.println("");

        final int[][] grid2 = { { 2, 1, 1 }, { 0, 1, 1 }, { 1, 0, 1 } };
        System.out.print("The time to rot oranges in grid 2 should be (some oranges will not rot) -1 and is: ");
        System.out.print(solution.orangesRotting(grid2));
        System.out.println("");

        final int[][] grid3 = { { 0, 2 }, };
        System.out.print("The time to rot oranges in grid 3 should be 0 and is: ");
        System.out.print(solution.orangesRotting(grid3));
        System.out.println("");
    }
}