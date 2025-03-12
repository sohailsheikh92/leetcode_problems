import java.util.*;

class Solution {
    public int numSquares(int n) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(n);
        visited.add(n);

        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            level++;

            for (int i = 0; i < size; i++) {
                int num = queue.poll();

                for (int j = 1; j * j <= num; j++) {
                    int next = num - j * j;
                    if (next == 0) return level;
                    if (!visited.contains(next)) {
                        queue.add(next);
                        visited.add(next);
                    }
                }
            }
        }
        return level;
    }
}
