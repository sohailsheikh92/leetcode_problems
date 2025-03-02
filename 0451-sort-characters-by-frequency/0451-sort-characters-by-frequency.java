class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch, 0)+1);}
        List<Map.Entry<Character,Integer>> li=new ArrayList<>(map.entrySet());
        li.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Character,Integer> entry : li)
                sb.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));


        return sb.toString();
    }
}