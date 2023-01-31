package AlgorithmsLeetCode_1.TwoPointers;

public class ReverseWords_557 {

    public static void main(String[] args) {
        ReverseWords_557 answerer = new ReverseWords_557();
        System.out.println(answerer.reverseWords("Go to IO Games?)"));
    }

    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder reversed = new StringBuilder();
        String[] strings = s.split(" ");
        for (int i = 0; i < strings.length; i++){
            reversed.append(strings[i]).reverse();
            result.append(reversed);
            if (i != strings.length - 1){
                result.append(' ');
            }
            reversed = new StringBuilder();
        }
        return result.toString();
    }
}
