package AlgorithmsLeetCode_1;

public class ReverseString_344 {
    public static void main(String[] args) {
        ReverseString_344 answerer = new ReverseString_344();
        answerer.reverseString(new char[]{'H','e','l','l','o','w'});
    }

    public void reverseString(char[] s) {
        for (int i = 0; i < s.length/2; i++){
            char buffer = s[s.length-1-i];
            s[s.length-1-i] = s[i];
            s[i] = buffer;
        }
    }
}
