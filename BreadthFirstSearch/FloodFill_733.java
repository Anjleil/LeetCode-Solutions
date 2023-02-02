package AlgorithmsLeetCode_1.BreadthFirstSearch;

public class FloodFill_733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        if (color != oldColor) fill(image, sr, sc, color, oldColor);
        return image;
    }

    public void fill (int[][] image, int sr, int sc, int color, int oldColor){
        if (image[sr][sc] == oldColor) {
            image[sr][sc] = color;
            if (sr >= 1) fill(image, sr-1, sc, color, oldColor);
            if (sc >= 1) fill(image, sr, sc-1, color, oldColor);
            if (sr + 1 < image.length) fill(image, sr+1, sc, color, oldColor);
            if (sc + 1 < image[0].length) fill(image, sr, sc+1, color, oldColor);
        }
    }
}
