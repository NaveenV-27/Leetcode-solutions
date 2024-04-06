class Solution {
    public String minRemoveToMakeValid(String s) {
        String result;
        char[] arr = s.toCharArray();
        int openParenthesesCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(')
                openParenthesesCount++;
            else if (arr[i] == ')') {
                if (openParenthesesCount == 0)
                    arr[i] = '*'; 
                else
                    openParenthesesCount--;
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (openParenthesesCount > 0 && arr[i] == '(') {
                arr[i] = '*'; 
                openParenthesesCount--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '*')
                sb.append(arr[i]);
        }
        return sb.toString();
    }
}
