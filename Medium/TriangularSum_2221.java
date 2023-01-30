package Medium;

public class TriangularSum_2221 {
    public static void main(String[] args) {
        TriangularSum_2221 answerer = new TriangularSum_2221();
        System.out.println(answerer.triangularSum(new int[]{1,1}));
    }

    public int triangularSum(int[] nums) {
        int numberOfSums = nums.length - 1;
        int j = 1;
        while (numberOfSums >= 1){
            if (numberOfSums % 4 == 0){
                for (int i = 0; i < numberOfSums-3; i++){
                    nums[i] = (nums[i] + 4*nums[i+1] + 6*nums[i+2] + 4*nums[i+3] + nums[i+4]) % 10;
                }
                numberOfSums -= 4;
            } else {
                for (int i = 0; i < nums.length-j; i++){
                    nums[i] = (nums[i] + nums[i+1]) % 10;
                }
                numberOfSums --;
            }
            j++;
        }
        return nums[0];
    }
}
