class Solution {
    public String minWindow(String s, String t) {
        int[] freqMap1 = new int[128];
        int[] freqMap2 = new int[128];
        int required = 0;
        int formed = 0;
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int minLeft = 0;
        

        for (char c : t.toCharArray()) {
            freqMap1[c]++;
            if (freqMap1[c] == 1) {required++;}
        }

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            freqMap2[c]++;
            

            if (freqMap2[c] == freqMap1[c]) {
                formed++;
            }

            while (formed == required) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minLeft = left;
                }

                freqMap2[s.charAt(left)]--;

                if (freqMap2[s.charAt(left)] < freqMap1[s.charAt(left)]) {
                    formed--;
                }

                left++;
            }

        }

        return (minLen == Integer.MAX_VALUE) ? "" : s.substring(minLeft, minLeft + minLen);
    }
}