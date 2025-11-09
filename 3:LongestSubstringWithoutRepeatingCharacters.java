/* Leetcode Medium Problem
Basically we are given a string of characters and this function is trying to determine the longest substring in that string that only contains unique characters.
I believe this is called the sliding window technique, what we do is we have a start and end int var and we loop while the end index is still less than the string length.
Then we see if the character is unique, if it is then we add it to the hashmap for record keeping and we update output if its less than our current count. If the character is not unique
then we have to update our start to include all other characters except the first one and we move on, decrementing the count once since that one technicially doesn't count.
This is O(n) time complexity since its just 1 loop and O(n) space since worst case scenario we store all characters again.
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int output = 0;
        int count = 0;
        
        HashMap<Character, Integer> current = new HashMap<>();
        for (int end = 0; end < s.length(); end++) {
            char letter = s.charAt(end);
            count++;

            if ((current.get(letter) != null) && (current.get(letter) >= start)) {
                start = current.get(letter) + 1;
                count--;
            }

            current.put(letter, end);
            if (output < (end - start + 1)) {
                output = end - start + 1;
            }

        }

        return output;
    }
}
