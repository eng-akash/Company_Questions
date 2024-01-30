package leetcode;

public class TwoSum {
    public static void twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("("+i+","+j+")");
//                    output => (0,3) return the inexes
                }
            }
        }
        return;
    }

    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 17;
        twoSum(nums,target);
    }
}
