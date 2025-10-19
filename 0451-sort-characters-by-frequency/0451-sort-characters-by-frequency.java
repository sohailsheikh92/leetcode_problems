class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency of each character
        for (char ch : s.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        StringBuilder sb = new StringBuilder();

        // Step 2: Build result by repeatedly picking max frequency
        while (!map.isEmpty()) {
            int max = Integer.MIN_VALUE;
            char maxChar = 0; // to store which character has max frequency

            // find character with highest frequency
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() > max) {
                    max = entry.getValue();
                    maxChar = entry.getKey();
                }
            }

            // append that character 'max' times
            for (int i = 0; i < max; i++)
                sb.append(maxChar);

            // remove that character from the map
            map.remove(maxChar);
        }

        return sb.toString();
    }
}
