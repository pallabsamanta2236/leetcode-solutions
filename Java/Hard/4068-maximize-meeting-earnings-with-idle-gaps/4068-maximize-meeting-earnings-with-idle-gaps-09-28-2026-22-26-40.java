class Solution {
    public long maxEarnings(int[][] meetings) {
        int n = meetings.length;
        int[][] m = new int[n][3];
        for (int i = 0; i < n; i++) m[i] = meetings[i].clone();
        java.util.Arrays.sort(m, (a, b) -> Integer.compare(a[1], b[1]));

        long[] dp = new long[n];
        long[] pref = new long[n];

        for (int i = 0; i < n; i++) {
            int s = m[i][0], e = m[i][1], r = m[i][2];
            // binary search: largest index p < i with m[p][1] <= s
            int lo = 0, hi = i - 1, p = -1;
            while (lo <= hi) {
                int mid = (lo + hi) >> 1;
                if (m[mid][1] <= s) {
                    p = mid;
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }

            long val = r; // pick just this meeting
            if (p >= 0 && pref[p] != Long.MIN_VALUE) {
                val = Math.max(val, r + (long)s + pref[p]);
            }
            dp[i] = val;
            long best = val - (long)e;
            pref[i] = i == 0 ? best : Math.max(pref[i - 1], best);
        }

        long ans = Long.MIN_VALUE;
        for (long v : dp) ans = Math.max(ans, v);
        return ans;
    }
}