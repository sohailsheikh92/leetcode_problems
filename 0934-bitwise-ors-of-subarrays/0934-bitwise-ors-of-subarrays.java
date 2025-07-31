class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        HashSet<Integer> res=new HashSet<>();
        HashSet<Integer> prev=new HashSet<>();
        int n=arr.length;
        for(int i : arr){
            HashSet<Integer> curr=new HashSet<>();
            curr.add(i);

            for(int j : prev){
                curr.add(j | i);
            }

            res.addAll(curr);
            prev=curr;
        }
        return res.size();
    }
}