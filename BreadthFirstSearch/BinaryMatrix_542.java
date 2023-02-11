package AlgorithmsLeetCode_1.BreadthFirstSearch;

public class BinaryMatrix_542 {
    public static void main(String[] args) {
        BinaryMatrix_542 sol = new BinaryMatrix_542();
        sol.updateMatrix(new int[][]{
                {0,0,0},
                {0,1,0},
                {1,1,1}});
    }

    public int[][] updateMatrix(int[][] mat) {
        boolean[][] beenHere = new boolean[mat.length][mat[0].length];
        for (int m = 0; m < mat.length; m++){
            for (int n = 0; n < mat[0].length; n++){
                if (mat[m][n] == 0){
                    findDistanceTo0(mat, m, n, 0, beenHere);
                }
            }
        }
        Math.min(Math.min(2,3),Math.min(1,2));
        return mat;
    }

    public void findDistanceTo0 (int[][] mat, int m, int n, int distance, boolean[][] beenHere){
        if (!beenHere[m][n]){
            beenHere[m][n] = true;
            if (m >= 1 && mat[m-1][n] != 0) mat[m-1][n] = mat[m][n] + 1;
            if (n >= 1 && mat[m][n-1] != 0) mat[m][n-1] = mat[m][n] + 1;
            if (m + 1 < mat.length && mat[m+1][n] != 0) mat[m+1][n] = mat[m][n] + 1;
            if (n + 1 < mat[0].length && mat[m][n+1] != 0 ) mat[m][n+1] = mat[m][n] + 1;
            if (m >= 1) findDistanceTo0(mat, m-1, n, mat[m][n], beenHere);
            if (n >= 1) findDistanceTo0(mat, m, n-1, mat[m][n], beenHere);
            if (m + 1 < mat.length) findDistanceTo0(mat, m+1, n, mat[m][n], beenHere);
            if (n + 1 < mat[0].length) findDistanceTo0(mat, m, n+1, mat[m][n], beenHere);
        }
    }
}
