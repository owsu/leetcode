// Leetcode Medium

/* This is the exact same as a typical academic CS
problem. The only difference is that we have two stacks within the class
which allows us to have a gitmin, it works by making sure that everytime we push a value,
if the value is not bigger than the current one then it  gets pushed, otherwise we push
a duplicate of a min. So a min stack would look like this
array [5,3,4,7,2] in this class would be:
stack variable (bottom to top) [5, 3, 4, 7, 2]
minStack variable (bottom to top) [5, 3, 3, 3, 2]
*/

class MinStack {
    Deque<Integer> stack;
    Deque<Integer> minStack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            int pushval = (val > minStack.peek()) ? minStack.peek() : val;
            minStack.push(pushval);
        }
    }
    
    public void pop() {
        minStack.pop();
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
