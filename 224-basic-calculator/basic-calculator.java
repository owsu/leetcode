class Solution {
    public int calculate(String s) {
        Deque<Integer> myStack = new ArrayDeque<>();
        int sign = 1;
        int num = 0;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char val = s.charAt(i);
            if (val == ' ') {continue;}

            if (Character.isDigit(val)) {
                num = num * 10 + (val - '0');
            } else if (val == '-') {
                result += sign * num;
                num = 0;
                sign = -1;
            } else if (val == '+') {
                result += sign * num;
                num = 0;
                sign = 1;
            } else if (val == '(') {
                myStack.push(result);
                myStack.push(sign);
                result = 0;
                sign = 1;
            } else if (val == ')') {
                result += sign * num;
                num = 0;
                int prevSign = myStack.pop();
                int prev = myStack.pop();

                result = prev + (prevSign * result);
            }
        }

        return result + (sign * num);
    }
}