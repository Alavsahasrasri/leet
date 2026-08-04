class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int l =0;
        int best =0;
        HashMap<Character, Integer> last = new HashMap<>();
        for(int r =0;r<s.length();r++){
            char ch = s.charAt(r);
            if(last.containsKey(ch) && last.get(ch) >= l){
                l = last.get(ch)+1;
            }
            last.put(ch,r);
            best = Math.max(best,r-l+1);
        }
        return best;
    }
}