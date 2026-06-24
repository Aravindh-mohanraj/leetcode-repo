class Solution {
    public int longestValidParentheses(String s) {
        int[] st = new int[s.length() + 1];
        int top = 0;
        st[top] = -1;

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st[++top] = i;
            } else {
                top--;

                if (top < 0) {
                    top = 0;
                    st[top] = i;
                } else {
                    ans = Math.max(ans, i - st[top]);
                }
            }
        }

        return ans;
    }
}