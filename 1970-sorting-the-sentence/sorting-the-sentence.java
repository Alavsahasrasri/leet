class Solution {
    public String sortSentence(String s) {
        String [] words = s.split(" ");
        String [] res = new String[words.length];

        for(String w : words){
            if(w.length()>0){
                int v = (w.charAt(w.length()-1)-'0')-1;
                res[v]= w.substring(0,w.length()-1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String wo : res){
            sb.append(wo).append(" ");
        }
        return sb.toString().trim();
        
        
    }
}