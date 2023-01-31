package AlgorithmsLeetCode_1.TwoPointers;

import java.util.Arrays;

public class RotateArray_189 {

    public static void main(String[] args) {
        RotateArray_189 answerer = new RotateArray_189();
        int[] nums = new int[]{1,2};
        System.out.println(Arrays.toString(answerer.rotate(nums, 3)));
    }

    public int[] rotate(int[] nums, int k) {
        if (nums.length <= 1)
            return nums;
        if (nums.length < k){
            while(k>0){
                for(int i = nums.length-1; i > 0; i--){
                    int tmp = nums[i];
                    nums[i] = nums[i-1];
                    nums[i-1]=tmp;
                }
                k--;
            }
            return nums;
        }
        int[] left = new int[k];
        System.arraycopy(nums, nums.length - k, left, 0, k);
        System.arraycopy(nums, 0, nums, nums.length - (nums.length - k), nums.length - k);
        System.arraycopy(left, 0, nums, 0, k);
        return nums;
    }
}
