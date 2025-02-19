class Solution {
    public boolean checkIfPangram(String sentence) {
        Map<Character,Integer> map= new HashMap<>();
        for(char i : sentence.toCharArray())
            map.put(i,map.getOrDefault(i,0)+1);
        int n=map.size();
        if(n<26)
            return false;
        return true;
    }
}