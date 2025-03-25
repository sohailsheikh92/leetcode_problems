class LUPrefix {
    private int n;              // Total number of videos
    private Set<Integer> uploaded; // Set of uploaded video numbers
    private int currentLongest; // Length of the current longest prefix

    public LUPrefix(int n) {
        this.n = n;
        this.uploaded = new HashSet<>();
        this.currentLongest = 0;
    }
    
    public void upload(int video) {
        uploaded.add(video);
        // Check if the next number after currentLongest is uploaded
        while (uploaded.contains(currentLongest + 1)) {
            currentLongest++;
        }
    }
    
    public int longest() {
        return currentLongest;
    }
}