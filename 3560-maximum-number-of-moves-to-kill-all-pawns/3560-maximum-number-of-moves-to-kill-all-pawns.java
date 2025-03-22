import java.util.*;

class Solution {
    private static final int BOARD_SIZE = 50;
    private int[][] dist;
    private Map<String, Integer> memo;

    public int maxMoves(int kx, int ky, int[][] positions) {
        int n = positions.length;
        dist = new int[n + 1][n + 1];
        memo = new HashMap<>();
        int[][] allPositions = new int[n + 1][2];
        System.arraycopy(positions, 0, allPositions, 0, n);
        allPositions[n] = new int[]{kx, ky};

        // Compute shortest distances between all positions
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                dist[i][j] = bfs(allPositions[i], allPositions[j]);
            }
        }

        // Start DFS from the knight's initial position
        int initialState = (1 << n) - 1; // All pawns are present
        return dfs(n, initialState, 1);
    }

    private int bfs(int[] start, int[] end) {
        if (Arrays.equals(start, end)) return 0;
        int[][] directions = {{-2, -1}, {-1, -2}, {1, -2}, {2, -1}, {2, 1}, {1, 2}, {-1, 2}, {-2, 1}};
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[BOARD_SIZE][BOARD_SIZE];
        queue.offer(start);
        visited[start[0]][start[1]] = true;
        int moves = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            moves++;
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                for (int[] dir : directions) {
                    int nx = current[0] + dir[0];
                    int ny = current[1] + dir[1];
                    if (nx >= 0 && nx < BOARD_SIZE && ny >= 0 && ny < BOARD_SIZE && !visited[nx][ny]) {
                        if (nx == end[0] && ny == end[1]) {
                            return moves;
                        }
                        queue.offer(new int[]{nx, ny});
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return -1; // Should never reach here
    }

    private int dfs(int last, int state, int turn) {
        if (state == 0) return 0;
        String key = last + "," + state + "," + turn;
        if (memo.containsKey(key)) return memo.get(key);

        int n = dist.length - 1;
        int result = (turn == 1) ? Integer.MIN_VALUE : Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if ((state & (1 << i)) != 0) {
                int nextState = state ^ (1 << i);
                int moves = dist[last][i];
                if (turn == 1) {
                    result = Math.max(result, moves + dfs(i, nextState, 0));
                } else {
                    result = Math.min(result, moves + dfs(i, nextState, 1));
                }
            }
        }

        memo.put(key, result);
        return result;
    }
}
