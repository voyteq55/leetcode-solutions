class Solution {
    public void moveZeroes(int[] nums) {
        int currentIndex = 1;
        while (currentIndex < nums.length && nums[currentIndex - 1] != 0) {
            currentIndex++;
        }
        int firstZero = currentIndex - 1;

        while (currentIndex < nums.length) {
            if (nums[currentIndex] != 0) {
                int temp = nums[firstZero];
                nums[firstZero] = nums[currentIndex];
                nums[currentIndex] = temp;
                firstZero++;
            }

            currentIndex++;
        }
    }
}