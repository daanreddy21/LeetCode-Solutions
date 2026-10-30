class Solution {
    public String sortSentence(String s) {
        HashMap<Integer,String> map =new HashMap<>();
        for(String str:s.split(" ")){
            int val = Integer.parseInt(str.substring(str.length() - 1));
            map.put(val, str.substring(0, str.length() - 1));
        }
        int val=1;
        String res="";
        while(map.containsKey(val)){
            res=res+map.get(val)+" ";
            val++;
        }
        return res.trim();

        
    }
}