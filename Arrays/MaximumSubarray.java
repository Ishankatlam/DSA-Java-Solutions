# Maximum Subarrays approach and code 
/*pattern detection - 
Sliding window 
Prefix Sum 
kadanes Algorithm
*/

// by kadanes algorithm o(n)
class Solution {
    public int maxSubArray(int[] nums) {
     int currsum = nums[0];
     int maxsum = nums[0];

     for(int i=1;i<nums.length;i++)
     {
        currsum = Math.max(nums[i] , currsum + nums[i]);
        maxsum = Math.max(maxsum , currsum);
     }
     return maxsum ;
    }
}

// prefix sum time complexiety - o(n)
    public static int maxSubArrayPrefix(int[] nums) {
        int n = nums.length;
        int prefixSum = 0;
        int minPrefix = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            prefixSum += nums[i];

            maxSum = Math.max(maxSum, prefixSum - minPrefix);

            minPrefix = Math.min(minPrefix, prefixSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArrayPrefix(nums));
    }


