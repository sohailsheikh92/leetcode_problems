class Solution {
    public String removeOuterParentheses(String s) {
        int cnt=0;
        StringBuilder sb=new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch=='('){
                if(cnt>0)
                    sb.append(ch);
                cnt++;
            }else{
                cnt=cnt-1;
                if(cnt>0)
                    sb.append(ch);
            }
        }
        return sb.toString();
    }
}