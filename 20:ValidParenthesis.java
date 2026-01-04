// LeetCode Easy

class Solution {
    public boolean isValid(String s) {
        // Apparently stack is deprecated so using deque is better even though it still functions LIFO.
        Deque<Character> myStack = new ArrayDeque<>(); 

        for (int i = 0; i < s.length(); i++) {
            char myChar = s.charAt(i);
            if (myChar == '(' || myChar == '{' || myChar == '[') {
                myStack.push(myChar);
            } else {
                if (myStack.isEmpty()) {return false;}

                char top = myStack.pop();
                if (myChar == ')' && top != '(') {return false;}
                if (myChar == '}' && top != '{') {return false;}
                if (myChar == ']' && top != '[') {return false;}
            }
        }


        return myStack.isEmpty();
    }
}
