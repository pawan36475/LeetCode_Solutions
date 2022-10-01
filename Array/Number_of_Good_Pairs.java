/*Link to problem: https://leetcode.com/problems/number-of-good-pairs/submissions/*/

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[101];
        int total_count = 0;
        for (int num : nums) {
            count[num]++;
        }

        for (int i : count) {
            total_count += (i * (i - 1)) / 2;
        }
        return total_count;
    }
}
