package Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalsTriangle_118 {

    public static void main(String[] args) {
        PascalsTriangle_118 answerer = new PascalsTriangle_118();
        System.out.println(answerer.generate(10));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalsTriangle = new ArrayList<>(numRows);
        pascalsTriangle.add(Collections.singletonList(1));
        for(int i = 1; i < numRows; i++){
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
        return pascalsTriangle;
    }
}
