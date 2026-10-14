class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int count = 0;
        char [] ran = ransomNote.toCharArray();
        char [] mag = magazine.toCharArray();
        Arrays.sort(ran);
        Arrays.sort(mag);
        int i = 0;
        int j = 0;
        
        while (count < ransomNote.length() && j < magazine.length()) {
            
            if (ran[i] == mag[j]) {
                count++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return count == ransomNote.length();
    }
}
