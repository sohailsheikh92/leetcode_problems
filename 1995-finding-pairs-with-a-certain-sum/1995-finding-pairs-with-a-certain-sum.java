import java.util.HashMap;
import java.util.Map;

class FindSumPairs {
    int[] nums1;
    int[] nums2;
    Map<Integer, Integer> freqMap; // Stores frequency of elements in nums2

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        freqMap = new HashMap<>();
        for (int num : nums2) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
    }

    public void add(int index, int val) {
        // Decrease frequency of old value
        int oldValue = nums2[index];
        freqMap.put(oldValue, freqMap.get(oldValue) - 1);
        if (freqMap.get(oldValue) == 0) {
            freqMap.remove(oldValue);
        }

        // Update nums2 and increase frequency of new value
        nums2[index] += val;
        int newValue = nums2[index];
        freqMap.put(newValue, freqMap.getOrDefault(newValue, 0) + 1);
    }

    public int count(int tot) {
        int count = 0;
        for (int num1 : nums1) {
            int target = tot - num1;
            count += freqMap.getOrDefault(target, 0);
        }
        return count;
    }
}
