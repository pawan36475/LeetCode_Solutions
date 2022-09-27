/*Link to problem: https://leetcode.com/problems/shuffle-the-array/*/

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int k = 1;
        ans[0] = nums[0];
        for (int i = 0; i < n; i++) {
            ans[k] = nums[n + i];
            if (k < (2 * n) - 1)
                ans[k + 1] = nums[i + 1];
            k += 2;
        }
        return ans;
    }
}

//Another logic

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int index = 0;
        for (int i = 0; i < n; i++) {
            ans[index] = nums[i];
            index++;
            ans[index] = nums[n + i];
            index++;
        }
        return ans;
    }
}
