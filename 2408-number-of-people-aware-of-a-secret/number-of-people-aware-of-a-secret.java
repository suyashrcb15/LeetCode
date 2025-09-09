class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int mod = 1_000_000_007;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        int sharing = 0;

        for (int day = 2; day <= n; day++) {
            if (day - delay >= 1) sharing = (sharing + dp[day - delay]) % mod;
            if (day - forget >= 1) sharing = (sharing - dp[day - forget] + mod) % mod;
            dp[day] = sharing;
        }

        int total = 0;
        for (int day = n - forget + 1; day <= n; day++) {
            total = (total + dp[day]) % mod;
        }

        return total;
    }
}