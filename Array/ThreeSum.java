/*Link to problem: https://leetcode.com/problems/3sum/description/*/
class Solution {
       List<List<Integer>> result = new ArrayList<>();
       public  void twoSumSorted(int i, int j, int[] nums, int target) {

        int a1 = nums[i - 1];

        while (i < j) {
                 int sum = nums[i] + nums[j];
            if (sum == target) {
                List<Integer> list = new ArrayList<>();
                list.add(a1);
                list.add(nums[i]);
                list.add(nums[j]);
                result.add(list);
            // checking duplicates b
             while (i < j && nums[i] == nums[i + 1]) i++;
            //checking duplicates c
            while (i < j && nums[j] == nums[j - 1]) j--;  
                i++;
                j--;
               
            }
            if (sum < target) {
                i++;
            } else if (sum>target){
                j--;
            }  
            }
        }
    

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        //a is kept fixed
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i - 1] != nums[i]) {
                twoSumSorted(i + 1, nums.length - 1, nums, 0 - nums[i]);
            }
        }
        return result;
    }
}
