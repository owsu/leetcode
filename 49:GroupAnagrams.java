//Leetcode Medium Problem

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hM = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            hM.putIfAbsent(key, new ArrayList<String>());
            hM.get(key).add(str);
        }

        return new ArrayList<>(hM.values());
    }
}
