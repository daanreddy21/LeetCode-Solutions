class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void quickSort(int[] nums, int low, int high) {

        if (low >= high) {
            return;
        }

        int pivot = nums[low];

        int i = low;
        int j = low;
        int k = high;

        while (j <= k) {

            if (nums[j] < pivot) {

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
                j++;

            } 
            else if (nums[j] > pivot) {

                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;

                k--;

            } 
            else {
                j++;
            }
        }

        quickSort(nums, low, i - 1);
        quickSort(nums, k + 1, high);
    }
}