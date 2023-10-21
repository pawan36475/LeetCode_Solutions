class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
         int[] actualArray = new int[candies.length];
        System.arraycopy(candies, 0, actualArray, 0, candies.length);
        Arrays.sort(candies);
        List<Boolean> maximum = new ArrayList<>();
        int max = candies[candies.length - 1];
        for (int i = 0; i < actualArray.length; i++) {
            if (actualArray[i] + extraCandies >= max) {
                maximum.add(true);
            } else {
                maximum.add(false);
            }
        }
        return maximum;
    }
}