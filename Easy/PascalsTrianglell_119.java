package Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalsTrianglell_119 {

    public static void main(String[] args) {
        PascalsTrianglell_119 answerer = new PascalsTrianglell_119();
        System.out.println(answerer.getRow(3));
    }

    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascalsTriangle = new ArrayList<>(rowIndex);
        pascalsTriangle.add(Collections.singletonList(1));
        for(int i = 1; i < rowIndex+1; i++){
            List<Integer> buffer = new ArrayList<>();
            buffer.add(1);
            if (i > 1){
                for(int j = 0; j < i-1; j++){
                    buffer.add(pascalsTriangle.get(i-1).get(j) + pascalsTriangle.get(i-1).get(j+1));
                }
            }
            buffer.add(1);
            pascalsTriangle.add(buffer);
        }
        return pascalsTriangle.get(rowIndex);
    }
}