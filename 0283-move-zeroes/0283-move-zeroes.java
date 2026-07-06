class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;

        for (int num : nums)
            if (num != 0)
                nums[index++] = num;

        while (index < nums.length)
            nums[index++] = 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna