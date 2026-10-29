import java.util.Arrays;

class Solution {
    public String[] findRelativeRanks(int[] score) {

        int[] arr2 = Arrays.copyOf(score, score.length);
        String[] output = new String[score.length];
        Arrays.sort(arr2);
        int count = 1;
        for (int i = arr2.length - 1; i >= 0; i--) {
            for (int j = 0; j < score.length; j++) {
                if (arr2[i] == score[j] && output[j] == null) {
                    if (count == 1) {
                        output[j] = "Gold Medal";
                    } 
                    else if (count == 2) {
                        output[j] = "Silver Medal";
                    } 
                    else if (count == 3) {
                        output[j] = "Bronze Medal";
                    } 
                    else {
                        output[j] = String.valueOf(count);
                    }
                    count++;
                    break;
                }
            }
        }
        return output;
    }
}