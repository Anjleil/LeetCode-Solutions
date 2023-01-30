package AlgorithmsLeetCode_1;

import java.util.Arrays;

public class TwoSumII_167 {

    public static void main(String[] args) {
        TwoSumII_167 answerer = new TwoSumII_167();
        System.out.println(Arrays.toString(answerer.twoSum(new int[]{1,2,3,4,4,9,56,90}, 8)));
    }

    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length; i++){
            int index = booleanSearch(numbers, target-numbers[i]);
            if(index != -1 && index != i){
                if (i > index){
                    return new int[]{index+1, i+1};
                }
                return new int[]{i+1, index+1};
            }
        }
        return numbers;
    }

    int booleanSearch(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;

        while (left<=right){
            int mid = left + (right-left)/2;
            if (target > nums[mid]){
                left = mid + 1;
            } else if (target < nums[mid]){
                right = mid - 1;
            } else if (nums[mid] == target)
                return mid;
        }
        return -1;
    }
}
