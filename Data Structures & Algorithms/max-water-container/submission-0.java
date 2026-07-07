class Solution {
    public int maxArea(int[] heights) {
        int start=0,end=heights.length-1;
        int maxArea=0;
        while(start<end){
            maxArea = Math.max(
                (end-start)*Math.min(heights[start],heights[end]),
                maxArea
            );
            if(heights[start]<heights[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return maxArea;
        
    }
}
