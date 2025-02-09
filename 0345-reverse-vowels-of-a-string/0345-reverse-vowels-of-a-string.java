class Solution {
    public String reverseVowels(String s) {
        char arr[]=s.toCharArray();
        String str="aeiouAEIOU" ; 
        int n=arr.length;
        int low=0,high=n-1;
        while(low<high){
            while(low<high){
                char ch=arr[low];
                if(str.indexOf(ch)!=-1)
                    break;
                low++;
            }
            while(low<high){
                char ch=arr[high];
                if(str.indexOf(ch)!=-1)
                    break;
                high--;
            }
            char temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        s=new String(arr);
        return s;
    }
}