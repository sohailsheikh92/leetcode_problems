class Solution {
    public String reverseWords(String s) {
        // int n=s.length();
        String arr[]=s.trim().split("\\s+");
        int n=arr.length;
        int i=0,j=n-1;
        while(i<j){
            String temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        String ans=String.join(" ",arr);
        return ans;
    }
}