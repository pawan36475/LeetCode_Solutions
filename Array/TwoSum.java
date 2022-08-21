/* Link to problem: https://leetcode.com/problems/two-sum/ */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    list.add(i);
                    list.add(j);
                }
            }
        }
        Integer a[] = list.toArray(new Integer[nums.length]);
        int actualArray[] = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            actualArray[j] = a[j].intValue();
        }
        return actualArray;
}
}
