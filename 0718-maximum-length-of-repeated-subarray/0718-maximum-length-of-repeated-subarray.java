class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int result = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int count = 0;
                int x = i;
                int y = j;

                while (x < nums1.length && y < nums2.length) {
                    if (nums1[x] == nums2[y]) {
                        count++;
                        x++;
                        y++;
                    } else {
                        break;
                    }
                }

                if (count > result) {
                    result = count;
                }
            }
        }

        return result;
    }
}