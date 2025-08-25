import java.util.*;

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        Map<Integer, List<Integer>> map = new HashMap<>();

        // Step 1: Fill map with diagonals
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int key = i + j;
                map.putIfAbsent(key, new ArrayList<>());
                map.get(key).add(mat[i][j]);
            }
        }

        // Step 2: Build result
        List<Integer> result = new ArrayList<>();
        for (int d = 0; d <= m + n - 2; d++) {
            List<Integer> diagonal = map.get(d);
            if (d % 2 == 0) {
                Collections.reverse(diagonal); // reverse for even diagonals
            }
            result.addAll(diagonal);
        }

        // Convert to array
        return result.stream().mapToInt(x -> x).toArray();
    }
}
