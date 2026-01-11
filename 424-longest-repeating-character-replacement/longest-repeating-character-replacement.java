class Solution {
    public int characterReplacement(String s, int k) {
        int output = 0;
        int maxFreq = 0;
        int start = 0;
        Map<Character, Integer> hm = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
            maxFreq = (maxFreq > hm.get(c)) ? maxFreq : hm.get(c);

            while ((end - start + 1) - maxFreq > k) {
                char leftChar = s.charAt(start);
                hm.put(leftChar, hm.get(leftChar) - 1);
                start++;
            }

            int window = (end - start + 1);
            output = (output > window) ? output : window;
        }

        return output;
    }
}