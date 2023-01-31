package Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,5,3,4,2,7,14};
        int target = 7;
        TwoSum_1 solutioner = new TwoSum_1();
        System.out.println(Arrays.toString(solutioner.twoSum(nums, target)));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<nums.length; i++){
            map.put(nums[i],i);
            int complement = target - nums[i];
            if (map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
        }
        return null;
    }

    int booleanSearch(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int mid = left + (right-left)/2;

        while (left!=right){
            if (nums[mid] == target){
                return mid;
            } else if (target > nums[mid]){
                left = mid + 1;
            } else
                right = mid - 1;
        }
        return -1;
    }
}
