class Solution {
    public int lengthOfLastWord(String s) {
        String sam =s.trim();
        String [] arr = sam.split(" ");
        String res = arr[arr.length-1];
        return res.length();

    
        
    }
}