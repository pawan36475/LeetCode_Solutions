/*Link to problem: https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/*/

//Approach- 1

class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stk = new Stack<>();
        char[] ans = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (ans[i] == '(') {
                stk.push(i);
            } else if (ans[i] == ')') {
                if (stk.empty()) {
                    ans[i] = '#';
                } else {
                    stk.pop();
                }
            }
        }
        while (!stk.empty()) {
            ans[stk.peek()] = '#';
            stk.pop();
        }
        StringBuilder str = new StringBuilder();
        for (int j = 0; j < ans.length; j++) {
            if (ans[j] != '#') {
                str.append(ans[j]);
            }
        }
        String st = str.toString();
        return st;
    }
}

//Approach- 2

class Solution {
    public String minRemoveToMakeValid(String s) {
        int count = 0;
        char[] ans = s.toCharArray();

        // extra closing bracket
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] == '(') {
                count++;
            } else if (ans[i] == ')') {
                if (count == 0) {
                    ans[i] = '#';
                } else {
                    count--;
                }
            }
        }
        //extra opening bracket
        count = 0;
        for (int j = ans.length - 1; j >= 0; j--) {
            if (ans[j] == ')') {
                count++;
            } else if (ans[j] == '(') {
                if (count == 0) {
                    ans[j] = '#';
                } else {
                    count--;
                }
            }
        }
        StringBuilder str = new StringBuilder();
        for (int k = 0; k < ans.length; k++) {
            if (ans[k] != '#')
                str.append(ans[k]);
        }
        String st = str.toString();
        return st;
    }
}
