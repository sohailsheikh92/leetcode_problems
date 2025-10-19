class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int arr1[]=new int[256];
        int arr2[]=new int[256];
        for(char ch : s.toCharArray()){
            arr1[ch-'0']++;
        }
        for(char ch : t.toCharArray())
            arr2[ch-'0']++;
        for(int i=0;i<256;i++){
            if(arr1[i]!=arr2[i])
                return false;
        }
        return true;
    }
}