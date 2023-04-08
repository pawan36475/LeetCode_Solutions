/*Link to problem: https://leetcode.com/problems/decode-xored-array/ */

class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] actualArray = new int[encoded.length + 1];
        actualArray[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            actualArray[i + 1] = encoded[i] ^ actualArray[i];
        }
        return actualArray;
    }
}
