package Medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring_3 {
    public static void main(String[] args) {
        String s = "dvdf";
        LongestSubstring_3 solutioner = new LongestSubstring_3();
        System.out.println(solutioner.lengthOfLongestSubstring(s));
    }

    public int lengthOfLongestSubstring(String s) {
        int max = 0, currentMax = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++){
            if (map.containsKey(s.charAt(i))){
                i = map.get(s.charAt(i)) + 1;
                currentMax = 0;
                map = new HashMap<>();
            }
            map.put(s.charAt(i),i);
            currentMax++;
            if (max < currentMax)
                max = currentMax;
        }
        return max;
    }
}
