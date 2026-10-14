class Solution {
    public int firstUniqChar(String s) {
        int index=-1;

            for(int i=0; i<s.length();i++){
                boolean b =true;
                for(int j= 0; j<s.length();j++){
                    if(j!=i && s.charAt(i)==s.charAt(j)){
                        b=false;
                        break;
                    }
                }
                if(b==true){
                    index=i;
                    break;
                }
            }


        return index;

    }
}