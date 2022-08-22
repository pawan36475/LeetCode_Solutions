/* Link to problem: https://leetcode.com/problems/two-sum/ */

/*Time complexity=O(n^2)*/
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

----------------------------------------------------------------------------------------------------------------------------------------------------------------------
/*Time Complexity=O(n)      [Optimized Solution]*/
    

public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        int complement = 0;
        for (int i = 0; i < nums.length; i++) {
            complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }
        return null;
    }
---------------------------------------------------------------------------------------------------------------------------------------------------------------------
/*Time Complexity=O(n)    [Optimized Solution]*/

 public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int complement = 0;
        for (int i = 0; i < nums.length; i++) {
            complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
