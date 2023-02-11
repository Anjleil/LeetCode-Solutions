package AlgorithmsLeetCode_1.BreadthFirstSearch;

public class RottingOranges_994 {
    public static void main(String[] args) {
        RottingOranges_994 solutioner = new RottingOranges_994();
        System.out.println(
                solutioner.orangesRotting(new int[][] {
                        {2,1,1},
                        {1,1,1},
                        {1,1,1}})
        );
    }

    public int orangesRotting(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2) dfs(grid,i,j,2);
            }
        }
        int time=2;
        for(int[] i: grid){
            for(int j: i){
                if(j==1) return -1;
                time=Math.max(time,j);
            }
        }
        return time-2;

    }

    void dfs(int[][] grid,int i,int j,int rot){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0 || (grid[i][j]>1 && grid[i][j]< rot)) return;
        grid[i][j]=rot;
        this.dfs(grid,i+1,j,rot+1);
        this.dfs(grid,i-1,j,rot+1);
        this.dfs(grid,i,j+1,rot+1);
        this.dfs(grid,i,j-1,rot+1);
    }
}
