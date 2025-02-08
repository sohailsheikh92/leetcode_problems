class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            int j=s.charAt(i);
            map.put((char)j,map.getOrDefault((char)j,0)+1);
        }
        for(int k=0;k<s.length();k++){
            if(map.get(s.charAt(k))==1)
                return k;
        }
        return -1;
    }
}