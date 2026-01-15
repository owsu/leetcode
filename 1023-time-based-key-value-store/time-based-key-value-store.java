class TimeMap {
    public Map<String, List<Integer>> timeStampMap;
    public Map<String, List<String>> keyMap;

    public TimeMap() {
        timeStampMap = new HashMap<>();
        keyMap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        timeStampMap.computeIfAbsent(key, k -> new ArrayList<>()).add(timestamp);
        keyMap.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
    }
    
    public String get(String key, int timestamp) {
        List<Integer> tsList = timeStampMap.get(key);
        List<String> keyList = keyMap.get(key);
        if (tsList == null) {return "";}

        int left = 0;
        int right = tsList.size() - 1;
        String result = "";
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (tsList.get(mid) <= timestamp) {
                result = keyList.get(mid);
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;


    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */