class Solution {
    public int minAddToMakeValid(String s) {
      int open = 0, close =0, ans =0;
      char[] inps= s.toCharArray();
      for(int i = 0; i<inps.length; i++){
        if(inps[i] == '('){
            open++;
        }else{
            if(open > 0){
                open--;
            }else {
                close++;
            }
        }        
      }  
    return open+close;}
}