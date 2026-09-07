class Solution {
    public String minWindow(String s, String t) {
        if(s.length()==0||t.length()==0)return"";
        Map<Character,Integer> need = new HashMap<>();
        for(char c:t.toCharArray()){
            need.put(c,need.getOrDefault(c,0)+1);
        }
        int required = need.size();
        int formed = 0;

        Map<Character,Integer> window = new HashMap<>();
        int l=0,r=0;
        int[] res = {-1,0,0};
        while(r<s.length()){
            char c = s.charAt(r);
            window.put(c,window.getOrDefault(c,0)+1);
            if(need.containsKey(c) 
            && window.get(c).intValue()==need.get(c).intValue()){
                formed++;
            }
            while(l<=r && formed==required){
                c=s.charAt(l);
                if(res[0]==-1||r-l+1<res[0]){
                    res[0]=r-l+1;
                    res[1]=l;
                    res[2]=r;
                }
                window.put(c,window.get(c)-1);
                if(need.containsKey(c) && window.get(c)<need.get(c)){
                    formed--;
                }
                l++;
            }
            r++;
        }
        return res[0]==-1?"":s.substring(res[1],res[2]+1);
    }
}