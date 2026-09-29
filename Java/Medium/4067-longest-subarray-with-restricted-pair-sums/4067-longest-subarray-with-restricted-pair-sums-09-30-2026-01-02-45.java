class Solution {
    public int maxSubarray(int[] nums) {
        int n = nums.length;
        int ans = 0, l = 0;
        for (int r = 0; r < n; r++) {
            while (hasBadTriple(nums, l, r)) {
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }

    private boolean hasBadTriple(int[] nums, int l, int r) {
        // Count occurrences of each value in [l..r]
        int[] cnt = new int[501];
        for (int i = l; i <= r; i++) cnt[nums[i]]++;
        
        // Check all pairs of values a, b and see if a + b exists
        for (int a = 1; a <= 500; a++) {
            if (cnt[a] == 0) continue;
            for (int b = a; b <= 500; b++) {
                if (cnt[b] == 0) continue;
                int s = a + b;
                if (s > 500 || cnt[s] == 0) continue;
                
                // Check if we can pick 3 distinct indices
                int needA = (a == s) ? 2 : 1;
                int needB = (b == s) ? 2 : 1;
                // But a and b might be the same value too
                int need = 0;
                if (a == b && b == s) need = 3;
                else if (a == b) need = 2;
                else if (a == s || b == s) need = 2;
                else need = 1;
                
                // Simpler: count how many of {a, b, s} we need at each value
                int[] req = new int[501];
                req[a]++; req[b]++; req[s]++;
                boolean ok = true;
                for (int v = 1; v <= 500; v++) {
                    if (req[v] > 0 && cnt[v] < req[v]) { ok = false; break; }
                }
                if (ok) return true;
            }
        }
        return false;
    }
}