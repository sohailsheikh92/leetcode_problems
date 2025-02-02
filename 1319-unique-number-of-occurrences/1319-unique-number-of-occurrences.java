class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        // Step 1: Count occurrences of each number
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Store frequencies in a HashSet
        Set<Integer> freqSet = new HashSet<>(freqMap.values());

        // Step 3: If frequencies are unique, their count should match the map size
        return freqSet.size() == freqMap.size();
    }
}
