class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        for (char c : s1.toCharArray()) {
            s1Count[c - 'a']++;
        }

        for (int end = 0; end < s2.length(); end++) {
            char c = s2.charAt(end);
            s2Count[c - 'a']++;

            if (end >= s1.length()) {
                char left = s2.charAt(end - s1.length());
                s2Count[left - 'a']--;
            }

            if (Arrays.equals(s1Count, s2Count)) {return true;}
        }


        return false;
    }
}