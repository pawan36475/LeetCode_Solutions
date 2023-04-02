/*Link to problem: https://leetcode.com/problems/valid-palindrome/*/

class Solution {
    public boolean isPalindrome(String s) {
          StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= 48 && ch <= 57)) {
                char chL = Character.toLowerCase(ch);
                sb.append(chL);
            }
        }
        if (sb.length() == 1) return true;
        if (sb.length() == 2 && sb.length() > 0) {
            if (sb.charAt(0) == sb.charAt(1)) {
                return true;
            } else return false;
        }
        int j = sb.length() - 1;
        for (int i = 0; i < sb.length(); i++) {
            if (i < j) {
                if (sb.charAt(i) != sb.charAt(j)) {
                    return false;
                } else {
                    j--;
                }
            }
        }
        return true;
    }
}
