package AlgorithmsLeetCode_1.SlidingWindow;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PermutationInString_567 {

    public static void main(String[] args) {
        PermutationInString_567 solutioner = new PermutationInString_567();
        System.out.println(solutioner.checkInclusion("ab","eidbaooo"));
    }

    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<s1.length(); i++){
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }

        Map<Character, Integer> map2 = new HashMap<>();
        for(int i = 0; i<s2.length(); i++){
            if (Objects.equals(map2.get(s2.charAt(i)), map.get(s2.charAt(i)))){
                map2.clear();
            }
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) + 1);
            if (Objects.equals(map, map2)){
                return true;
            }
            if (map.get(s2.charAt(i)) == null){
                map2.clear();
            }
        }
        return false;
    }
}
