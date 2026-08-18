class Solution {
    public boolean isPalindrome(String s) {
        String lo = s.toLowerCase().trim();
        int i = 0;
        int j = lo.length()-1;
       while(i<=j){
        while (i<j && !Character.isLetterOrDigit(lo.charAt(i))){
            i++;
        }
        while(i<j && !Character.isLetterOrDigit(lo.charAt(j))){
            j--;
        }
        if(lo.charAt(i) != lo.charAt(j)){
            System.out.println(lo.charAt(i)+" "+lo.charAt(j));
            return false;
        }
        i++;j--;
       }
        return true;
    }
}