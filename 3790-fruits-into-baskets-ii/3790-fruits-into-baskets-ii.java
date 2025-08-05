class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=fruits.length;
        boolean placed[]=new boolean[n];
        int unplaced=0;
        for(int i=0;i<n;i++){
            boolean placedd=false;
            for(int j=0;j<n;j++){
                if(!placed[j] && fruits[i]<=baskets[j]){
                    placed[j]=true;
                    placedd=true;
                    break;
                }
            }
            if(!placedd)
                unplaced++;
        }
        return unplaced;
    }
}