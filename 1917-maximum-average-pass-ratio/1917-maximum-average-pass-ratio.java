import java.util.*;

class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> pq = new PriorityQueue<>(
            (a, b) -> Double.compare(b[0], a[0])  // max heap by gain
        );

        for (int[] c : classes) {
            int pass = c[0], total = c[1];
            double gain = getGain(pass, total);
            pq.offer(new double[]{gain, pass, total});
        }

        while (extraStudents-- > 0) {
            double[] top = pq.poll();
            int pass = (int) top[1];
            int total = (int) top[2];
            
            pass++;
            total++;
            
            double gain = getGain(pass, total);
            pq.offer(new double[]{gain, pass, total});
        }

        double sum = 0;
        while (!pq.isEmpty()) {
            double[] cur = pq.poll();
            sum += cur[1] / cur[2];  // pass / total
        }

        return sum / classes.length;
    }

    private double getGain(int pass, int total) {
        return (double)(pass + 1) / (total + 1) - (double)pass / total;
    }
}
