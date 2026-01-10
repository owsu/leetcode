// Leetcode Medium Problem

class Solution {
    public String simplifyPath(String path) {
        Deque<String> myStack = new ArrayDeque<>();
        String[] parts = path.split("/");

        for (String part : parts) {
            if (part.equals("..")) {
                if (!myStack.isEmpty()) {myStack.pop();}
            } else if (!part.equals(".") && !part.isEmpty()) {
                myStack.push(part);
            }
        }

        StringBuilder output = new StringBuilder();
        Iterator<String> iterator = myStack.descendingIterator();
        while (iterator.hasNext()) {
            output.append("/").append(iterator.next());
        }

        return (output.isEmpty()) ? "/" : output.toString();
    }
}
