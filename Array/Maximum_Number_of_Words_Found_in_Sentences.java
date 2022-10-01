/*Link to problem:  https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/*/

import java.util.*;

class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = 0, temp = 0;
        StringTokenizer st;
        for (int i = 0; i < sentences.length; i++) {
            st = new StringTokenizer(sentences[i]);
            count = st.countTokens();
            temp = Math.max(count, temp);
        }
        return temp;
    }
}
