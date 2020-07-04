package P994RottingOranges;

import java.util.ArrayList;
import java.util.List;

class Solution1 {
    final static int[][] STEPS = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };

    public int orangesRotting(int[][] grid) {
        int steps = 0;
        List<int[]> rottenOranges = getRottenOranges(grid);
        while (rottenOranges.size() > 0) {
            List<int[]> rottingOranges = new ArrayList<>();
            for (int[] rottenOrange : rottenOranges) {
                List<int[]> adjacentOranges = findAdjacent(rottenOrange, grid);
                for (int[] adjacentOrange : adjacentOranges) {
                    int r = adjacentOrange[0];
                    int c = adjacentOrange[1];
                    if (grid[r][c] == 1) {
                        rottingOranges.add(adjacentOrange);
                        grid[r][c] = 2;
                    }
                }
            }
            rottenOranges = rottingOranges;
            if (rottenOranges.size() > 0) {
                steps++;
            }
        }
        return containsFresh(grid) ? -1 : steps;
    }

    private static List<int[]> findAdjacent(int[] orange, int[][] grid) {
        List<int[]> adjacentOranges = new ArrayList<>();
        final int r = orange[0];
        final int c = orange[1];
        for (int[] step : STEPS) {
            int nr = r + step[0];
            int nc = c + step[1];
            if (nr < grid.length && nc < grid[0].length && nr >= 0 && nc >= 0) {
                adjacentOranges.add(new int[] { nr, nc });
            }
        }
        return adjacentOranges;
    }

    private static List<int[]> getRottenOranges(int[][] grid) {
        List<int[]> rottenOranges = new ArrayList<>();
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 2) {
                    rottenOranges.add(new int[] { r, c });
                }
            }
        }
        return rottenOranges;
    }

    private static boolean containsFresh(int[][] grid) {
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
