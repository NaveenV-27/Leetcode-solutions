class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            switch(ch) {
                case '*': if(sb.length() > 0)
                            sb.delete(sb.length()-1, sb.length());
                            break;
                
                case '#': sb.append(sb.toString());
                          break;
                case '%': sb = sb.reverse();
                          break;  

                default: sb.append(ch);
            }
        }
        return sb.toString();
    }
}
