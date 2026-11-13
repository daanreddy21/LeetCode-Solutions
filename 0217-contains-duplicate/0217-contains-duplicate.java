class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm= new HashMap<>();

        for(int i=0;i<nums.length;i++) {
            int el = nums[i];
            if(hm.containsKey(el)) {
                hm.put(el,hm.get(el)+1);
            }
            else {
                hm.put(el,1);
            }
        }
        
        Set<Integer> keys = hm.keySet();

        for(int key : keys) {
            if(hm.get(key) > 1) {
                return true;
            }
        }
        return false;
    }
}