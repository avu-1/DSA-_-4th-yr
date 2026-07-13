import java.util.Arrays;
import java.util.Scanner;

public class KadanesAlgo {

    class Solution {
        public int maxSubArray(int[] nums) {

            int sum = 0;
            int max = Integer.MIN_VALUE;

            for (int num : nums) {
                sum += num;

                if (sum > max) {
                    max = sum;
                }

                if (sum < 0) {
                    sum = 0;
                }
            }

            return max;
        }
    }

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        KadanesAlgo.Solution solution = new KadanesAlgo().new Solution();

        System.out.println(
                "Maximum subarray sum = " + solution.maxSubArray(nums));
    }
}