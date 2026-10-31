class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int i=0;
        int j = height.length-1;
        while (i !=j){    
            int min=Math.min(height[i],height[j]);
            int out = min*(j-i);
            max=Math.max(out,max);
            if(height[i]< height[j]){
                i++;
            }
            else{
                j--;
            }  

        }

        return max;
        
    }
}