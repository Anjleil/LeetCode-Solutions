package InProgress;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Triangle_120 {

    public static void main(String[] args) {
        Triangle_120 answerer = new Triangle_120();
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Collections.singletonList(-1));

        List<Integer> buffer = new ArrayList<>();
        buffer.add(2);
        buffer.add(3);
        triangle.add(buffer);

        buffer = new ArrayList<>();
        buffer.add(1);
        buffer.add(-1);
        buffer.add(-3);
        triangle.add(buffer);

        System.out.println(answerer.minimumTotal(triangle));
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int indexOfMin = 0;
        int sum = triangle.get(0).get(indexOfMin);
        for (int i = 1; i < triangle.size(); i++){
            sum += Math.min(triangle.get(i).get(indexOfMin),triangle.get(i).get(indexOfMin+1));
            indexOfMin = triangle.get(i).indexOf(Math.min(triangle.get(i).get(indexOfMin),triangle.get(i).get(indexOfMin+1)));
        }
        return sum;
    }
}
