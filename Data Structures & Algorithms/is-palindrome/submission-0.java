class Solution {
    public boolean isPalindrome(String s) {
        int left=0,right=s.length()-1;
        while(left<=right){
            char a=Character.toUpperCase(s.charAt(left)),
            b=Character.toUpperCase(s.charAt(right));
            if(!Character.isLetterOrDigit(a)){
                left++;
            }
            else if(!Character.isLetterOrDigit(b)){
                right--;
            }
            else{
                if(a!=b){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
