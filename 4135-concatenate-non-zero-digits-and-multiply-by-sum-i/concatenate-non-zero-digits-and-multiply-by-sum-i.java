class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder str = new StringBuilder();
        long sum = 0;
        while (n != 0) {
            long rem = n % 10;
            if (rem != 0) {
                sum += rem;
                str.append(rem);
            }
            n /= 10;
        }
        if (str.length() == 0) {
            return 0;
        }
        str.reverse();
        long num = Long.parseLong(str.toString());
        return num * sum;
    }
}