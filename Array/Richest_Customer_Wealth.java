/* Link to problem: https://leetcode.com/problems/richest-customer-wealth/*/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        int temp = 0;
        int m = accounts.length;
        int n = accounts[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                temp = temp + accounts[i][j];
            }
            sum = Math.max(temp, sum);
            temp = 0;
        }
        return sum;
    }
}
