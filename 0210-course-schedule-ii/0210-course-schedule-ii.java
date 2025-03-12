import java.util.*;

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] inDegree = new int[numCourses];
        int[] order = new int[numCourses];
        
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] pre : prerequisites) {
            graph.get(pre[1]).add(pre[0]);
            inDegree[pre[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) queue.add(i);
        }

        int index = 0;
        while (!queue.isEmpty()) {
            int course = queue.poll();
            order[index++] = course;

            for (int next : graph.get(course)) {
                inDegree[next]--;
                if (inDegree[next] == 0) queue.add(next);
            }
        }

        return index == numCourses ? order : new int[0]; // If cycle exists, return empty array
    }
}
