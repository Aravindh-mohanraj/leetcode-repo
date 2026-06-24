class Solution {
    public boolean isValid(String s) {
        int a = s.length(), n = 0;
        char[] b = new char[a];

        for (int i = 0; i < a; i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                b[n++] = c;
            } else {
                if (n == 0) return false;

                if (c == ')' && b[n - 1] == '(') n--;
                else if (c == ']' && b[n - 1] == '[') n--;
                else if (c == '}' && b[n - 1] == '{') n--;
                else return false;
            }
        }

        return n == 0;
    }
}