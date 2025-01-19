// sorting solution
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0; // Handle edge case

        Arrays.sort(nums); // Sort the array
        int result = 1; // At least one number forms a sequence
        int streak = 1;

        for (int i = 1; i < nums.length; i++) { // Start from index 1
            if (nums[i] == nums[i - 1]) {
                // Skip duplicates
                continue;
            } else if (nums[i] == nums[i - 1] + 1) {
                // Consecutive sequence found
                streak++;
            } else {
                // End of a streak, update result and reset streak
                result = Math.max(result, streak);
                streak = 1;
            }
        }

        // Final comparison to account for the last streak
        return Math.max(result, streak);
    }
}
// if there is no sequence then we are supposed to give back 1 as the answer 
