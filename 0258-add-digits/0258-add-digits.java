class Solution {
    public int addDigits(int num) {
        int n = num;
        while (n > 9) {
            int result = 0;
            while (n > 0) {
                int digit = n % 10;
                result = result + digit;
                n = n / 10;
            }
            n = result;
        }
        return n;
    }
}
