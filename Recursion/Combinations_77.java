package AlgorithmsLeetCode_1.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Combinations_77 {

    public static void main(String[] args) {
        Combinations_77 sol = new Combinations_77();
        System.out.println(sol.combine(4,3));

    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        combinations(1, n, k, new ArrayList<>(), result);
        return result;
    }

    void combinations(int start, int n, int k, List<Integer> cur, List<List<Integer>> result) {
        if (cur.size() == k) {
            result.add(new ArrayList<>(cur));
            return;
        }
        for (int i = start; i <= n; i++) {
            cur.add(i);
            combinations(i + 1, n, k, cur, result);
            cur.remove(cur.size() - 1);
        }
    }
}
