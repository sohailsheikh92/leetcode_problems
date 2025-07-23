class Solution {
    public int maximumGain(String s, int x, int y) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        int ans=0;
        if(y>x){
            for(char ch : s.toCharArray()){
                if(!st.isEmpty() && st.peek()=='b' && ch=='a'){
                    ans+=y;
                    st.pop();
                }else
                    st.push(ch);
            }
            while(!st.isEmpty())
                sb.append(st.pop());
            sb.reverse();
            for(int i=0;i<sb.length();i++){
                if(!st.isEmpty() && st.peek()=='a' && sb.charAt(i)=='b'){
                    ans+=x;
                    st.pop();
                }else
                    st.push(sb.charAt(i));   
            }
        }else{
            for(char ch : s.toCharArray()){
                if(!st.isEmpty() && st.peek()=='a' && ch=='b'){
                    ans+=x;
                    st.pop();
                }else
                    st.push(ch);
            }
            while(!st.isEmpty())
                sb.append(st.pop());
            sb.reverse();
            for(int i=0;i<sb.length();i++){
                if(!st.isEmpty() && st.peek()=='b' && sb.charAt(i)=='a'){
                    ans+=y;
                    st.pop();
                }else
                    st.push(sb.charAt(i));   
            }
        }   
        return ans;
    }
}