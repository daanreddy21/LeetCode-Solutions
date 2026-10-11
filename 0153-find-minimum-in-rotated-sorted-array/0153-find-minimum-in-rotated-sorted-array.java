class Solution {
    public int findMin(int[] nums) { 
        for(int i=0; i<nums.length-1; i++){
            for (int j=0; j<nums.length-1-i; j++){
                if(nums[j] > nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        int min =nums[0];
        for (int i=0; i<nums.length;i++){
            if(nums[i]<=min){
                min=nums[i];
            }     
        }
        return min;
        
    }
}