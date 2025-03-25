class NumArray {
    private int[] tree;  // Segment tree array
    private int n;       // Size of the input array
    private int[] nums;  // Reference to the original array

    public NumArray(int[] nums) {
        this.n = nums.length;
        this.nums = nums;
        // Segment tree size is approximately 4n for a complete binary tree
        this.tree = new int[4 * n];
        if (n > 0) {
            buildTree(0, 0, n - 1);
        }
    }
    
    // Build the segment tree
    private void buildTree(int node, int start, int end) {
        if (start == end) {
            tree[node] = nums[start];
            return;
        }
        int mid = (start + end) / 2;
        buildTree(2 * node + 1, start, mid);      // Left child
        buildTree(2 * node + 2, mid + 1, end);    // Right child
        tree[node] = tree[2 * node + 1] + tree[2 * node + 2];
    }
    
    // Update the segment tree
    private void updateTree(int node, int start, int end, int index, int val) {
        if (start == end) {
            nums[index] = val;
            tree[node] = val;
            return;
        }
        int mid = (start + end) / 2;
        if (index <= mid) {
            updateTree(2 * node + 1, start, mid, index, val);
        } else {
            updateTree(2 * node + 2, mid + 1, end, index, val);
        }
        tree[node] = tree[2 * node + 1] + tree[2 * node + 2];
    }
    
    // Query the segment tree for range sum
    private int queryTree(int node, int start, int end, int left, int right) {
        if (right < start || left > end) {
            return 0;  // Out of range
        }
        if (left <= start && right >= end) {
            return tree[node];  // Fully within range
        }
        int mid = (start + end) / 2;
        int leftSum = queryTree(2 * node + 1, start, mid, left, right);
        int rightSum = queryTree(2 * node + 2, mid + 1, end, left, right);
        return leftSum + rightSum;
    }
    
    public void update(int index, int val) {
        updateTree(0, 0, n - 1, index, val);
    }
    
    public int sumRange(int left, int right) {
        return queryTree(0, 0, n - 1, left, right);
    }
}