import java.util.*;

class Solution {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        Map<Integer, Integer> frequency = new HashMap<>();

        // Convert words into bitmasks and count frequencies
        for (String word : words) {
            int mask = 0;
            for (char c : word.toCharArray()) {
                mask |= (1 << (c - 'a')); // Set bit for each unique character
            }
            frequency.put(mask, frequency.getOrDefault(mask, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        for (String puzzle : puzzles) {
            int firstLetterMask = 1 << (puzzle.charAt(0) - 'a');
            int count = 0;

            // Generate all subsets of the puzzle string
            int mask = 0;
            for (char c : puzzle.toCharArray()) {
                mask |= (1 << (c - 'a'));
            }

            // Iterate over all subsets of the puzzle mask
            for (int subMask = mask; subMask > 0; subMask = (subMask - 1) & mask) {
                if ((subMask & firstLetterMask) != 0 && frequency.containsKey(subMask)) {
                    count += frequency.get(subMask);
                }
            }

            result.add(count);
        }
        return result;
    }
}
