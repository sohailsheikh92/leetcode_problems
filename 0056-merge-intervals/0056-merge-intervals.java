class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        List<int[]> li=new ArrayList<>();
        for(int[] i :  intervals){
            if(li.isEmpty() || li.get(li.size()-1)[1]<i[0])
                li.add(i);
            else{
                li.get(li.size()-1)[1]=Math.max(li.get(li.size()-1)[1],i[1]);
            }
        }
        return li.toArray(new int[li.size()][]);
    }
}