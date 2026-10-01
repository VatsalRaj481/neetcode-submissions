class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int repeat=-1;
        for(int num:nums){
            if(!set.add(num)){ 
                repeat = num;
                break;
            }
        }
        return repeat;
    }
}
