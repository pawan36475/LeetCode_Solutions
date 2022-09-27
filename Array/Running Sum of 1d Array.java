/* Link to problem: https://leetcode.com/problems/running-sum-of-1d-array/*/

class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        int sum = ans[0];
        for (int i = 1; i < ans.length; i++) {
            sum = sum + nums[i];
            ans[i] = sum;
        }
        return ans;
    }
}


//Another solution

class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}
