public class maxSubArrayBrute {
    public static int maxSubArrayBrute(int[] nums){
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0;i< nums.length;i++){
            int currSum = 0;
            for(int j = i;j<nums.length;j++){
                currSum = currSum + nums[j];
                maxSum = Math.max(maxSum,currSum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.print("Array: [");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + (i < nums.length - 1 ? ", " : ""));
        }
        System.out.println("]");
        
        int result = maxSubArrayBrute(nums);
        System.out.println("Maximum Subarray Sum (Brute Force): " + result);
    }
}