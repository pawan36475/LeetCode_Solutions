/*Link to problem: https://leetcode.com/problems/container-with-most-water/description/*/

class Solution {
    public int maxArea(int[] height) {
           int max = 0;
        int j = height.length - 1;
        int k = 0;
        for (int i = 0; i < height.length; i++) {

            if (k < j) {
                int sum = (j - k) * Math.min(height[k], height[j]);
                max = Math.max(max, sum);
                if (height[k] < height[j]) {
                    k++;
                } else {
                    j--;
                }

            }

        }
        return max;
    }
}
