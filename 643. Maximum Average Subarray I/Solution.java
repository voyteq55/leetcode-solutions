class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = getSubarraySum(nums, 0, k);
        for (int i = 1; i < nums.length - k + 1; i++) {
            sum = Math.max(sum, getSubarraySum(nums, i, k));
        }
        return (double) sum / k;
    }

    private int getSubarraySum(int[] nums, int startIndex, int subarrayLength) {
        int sum = 0;
        for (int i = startIndex; i < startIndex + subarrayLength; i++) {
            sum += nums[i];
        }
        return sum;
    }
}