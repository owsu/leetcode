// Leetcode Medium Problem

class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> myStack = new ArrayDeque<>();

        for (String num : tokens) {
            if (!num.equals("+") && !num.equals("-") && !num.equals("*") && !num.equals("/")) {
                int numToAdd = Integer.parseInt(num);
                myStack.push(numToAdd);
            } else {
                if (num.equals("+")) {
                    int num1 = myStack.pop();
                    int num2 = myStack.pop();
                    myStack.push(num1 + num2);
                }
                if (num.equals("-")) {
                    int num1 = myStack.pop();
                    int num2 = myStack.pop();
                    myStack.push(num2 - num1);
                }
                if (num.equals("*")) {
                    int num1 = myStack.pop();
                    int num2 = myStack.pop();
                    myStack.push(num1 * num2);
                }
                if (num.equals("/")) {
                    int num1 = myStack.pop();
                    int num2 = myStack.pop();
                    myStack.push(num2 / num1);
                }
            }
            
        }

        return myStack.peek();

    }
}
