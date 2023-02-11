package AlgorithmsLeetCode_1.BreadthFirstSearch;

public class MaxAreaIsland_695 {
    public static void main(String[] args) {
        MaxAreaIsland_695 solutioner = new MaxAreaIsland_695();
        System.out.println(
                solutioner.maxAreaOfIsland(new int[][] {
                        {0,0,1,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,0,0,0,1,1,1,0,0,0},
                        {0,1,1,0,1,0,0,0,0,0,0,0,0},
                        {0,1,0,0,1,1,0,0,1,0,1,0,0},
                        {0,1,0,0,1,1,0,0,1,1,1,0,0},
                        {0,0,0,0,0,0,0,0,0,0,1,0,0},
                        {0,0,0,0,0,0,0,1,1,1,0,0,0},
                        {0,0,0,0,0,0,0,1,1,0,0,0,0}})
        );

    }



    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0, area = 0;
        boolean[][] beenHere = new boolean[grid.length][grid[0].length];
        for (int i = 0; i<grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (!beenHere[i][j] && grid[i][j] != 0){
                    area = maxIsland(grid, i, j, area, beenHere);
                    if (maxArea < area)
                        maxArea = area;
                    area = 0;
                }
            }
        }
        return maxArea;
    }

    public int maxIsland(int[][] grid, int i, int j, int maxArea, boolean[][] beenHere){
        if (!beenHere[i][j] && grid[i][j] != 0) {
            beenHere[i][j] = true;
            maxArea++;
            if (i >= 1) maxArea = maxIsland(grid, i-1, j, maxArea, beenHere);
            if (j >= 1) maxArea = maxIsland(grid, i, j-1, maxArea, beenHere);
            if (i + 1 < grid.length) maxArea = maxIsland(grid, i+1, j, maxArea, beenHere);
            if (j + 1 < grid[0].length) maxArea = maxIsland(grid, i, j+1, maxArea, beenHere);
        }
        return maxArea;
    }

}
