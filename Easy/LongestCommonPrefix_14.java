package Easy;

public class LongestCommonPrefix_14 {

    public static void main(String[] args) {
        LongestCommonPrefix_14 answerer = new LongestCommonPrefix_14();
        System.out.println(
                answerer.longestCommonPrefix(new String[]{"a", "aa", "aaaa"}));
    }

    public String longestCommonPrefix(String[] strs) {
        String commonPrefix = "";
        int j = 0;
        while (j < strs[0].length()){
            int i = 0;
            while (i < strs.length && strs[i].startsWith(commonPrefix.concat(String.valueOf(strs[0].charAt(j))))){
                i++;
            }
            if (i == strs.length)
                commonPrefix = commonPrefix.concat(String.valueOf(strs[0].charAt(j)));
            else
                return commonPrefix;
            j++;
        }
        return commonPrefix;
    }
}
