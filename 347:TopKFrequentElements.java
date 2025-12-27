// Leetcode Medium

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // so pretty much we have an array like 0,0,0,0,0,0. the index is the frequency then we just
        // reverse loop until we get top k and return the output

        // wrong type of bucket but same idea, just have that array be a list of arrays thats all
        // so it prevents an issue whenever nums have same frequency or if the num is 0

        Map<Integer, Integer> hm =  new HashMap<>();
        List<Integer>[] bucket = new List[nums.length + 1];
        int[] output = new int[k];

        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        for (Integer num : hm.keySet()) {
            if (bucket[hm.get(num)] == null) {
                bucket[hm.get(num)] = new ArrayList<>();
            }
            bucket[hm.get(num)].add(num);
        }

        for (int i = bucket.length - 1; i > 0; i--) {
            if (bucket[i] == null) {
                continue;
            }
            if (k == 0) {
                break;
            }
            for (int j = 0; j < bucket[i].size(); j++) {
                output[k - 1] = bucket[i].get(j);
                k -= 1;
                if (k == 0) {
                    break;
                }
            }
        }

        return output;
    }
}
