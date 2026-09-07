class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,maxLen=0;
        Set<Character> set = new HashSet<>();
        for(int right=0;right<s.length();right++){
            char c =s.charAt(right);
            if(set.contains(c)){
                while(set.contains(c))
                {
                    set.remove(s.charAt(left));
                    left++;
                }
            }
            maxLen=Math.max(maxLen,right-left+1);
            set.add(c);
        }
        return maxLen;
    }
}
