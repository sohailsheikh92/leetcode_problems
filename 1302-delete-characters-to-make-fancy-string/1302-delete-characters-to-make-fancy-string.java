class Solution {
    public String makeFancyString(String s) {
        if(s.length()<3)
            return s;
        StringBuilder sb=new StringBuilder();
        int cnt=1;
        sb.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==s.charAt(i)){
                cnt=cnt+1;
                if(cnt<3){
                    sb.append(s.charAt(i));
                }else{
                    cnt=cnt+1;
                }
            }else{
                cnt=1;
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}