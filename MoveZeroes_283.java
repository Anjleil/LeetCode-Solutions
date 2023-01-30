package AlgorithmsLeetCode_1;

public class MoveZeroes_283 {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if (nums[i]!=0){
                if (i == j){
                    j++;
                } else{
                    nums[j] = nums[i];
                    nums[i] = 0;
                    j++;
                }
            }
        }
    }
}
