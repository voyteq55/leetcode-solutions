class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        int currentMaxSum = currentSum;
        
        for (int currentStartIndex = 1; currentStartIndex < nums.length - k + 1; currentStartIndex++) {
            currentSum = currentSum - nums[currentStartIndex - 1] + nums[currentStartIndex + k - 1];
            currentMaxSum = Math.max(currentSum, currentMaxSum);
        }
        return (double) currentMaxSum / k;
    }
}