class Solution {
    public int minInsertions(String s) {
        int open =0;
        int close=0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                open=open +2;
                if (open % 2 != 0) {
                    close++;
                    open--;
                }

            } else {
                open --;
                if (open < 0) {
                    close ++;
                    open = 1;
                } 

            }
        }

        return open+close;
        
        
    }
}