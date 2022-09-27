/*https://leetcode.com/problems/concatenation-of-array/*/

class Solution {
    public int[] getConcatenation(int[] nums) {
         int length = 2 * (nums.length);
        int[] concatArray = new int[length];
        for (int i = 0; i < concatArray.length; i++) {
            concatArray[i] = nums[i % (nums.length)];
        }   
         return concatArray;
    }   
}

//Solution with less running time

class Solution {
    public int[] getConcatenation(int[] nums) {
         int n = nums.length;
        int ans[] = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[n + i] = nums[i];
        }
        return ans;
    }  
}
