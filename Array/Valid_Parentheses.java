/* Link to problem: https://leetcode.com/problems/valid-parentheses/*/


class Solution {
    public boolean isValid(String s) {
        int len = s.length();
//         if(len%2==1){    //can be used to reduce the time
//             return false;
//         }
        char[] ch = s.toCharArray();
        System.out.println(ch.length);
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < len; i++) {
            if (ch[i] == '(' || ch[i] == '{' || ch[i] == '[') {
                stk.push(ch[i]);
            } else if (!stk.empty() && ch[i] == ')' && stk.peek() == '(') {
                stk.pop();
            } else if (!stk.empty() && ch[i] == '}' && stk.peek() == '{') {
                stk.pop();
            } else if (!stk.empty() && ch[i] == ']' && stk.peek() == '[')
                stk.pop();

            else {
                return false;
            }
        }

        return stk.empty();
    }
}
