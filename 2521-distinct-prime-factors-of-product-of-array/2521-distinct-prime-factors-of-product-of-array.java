class Solution {
    public int distinctPrimeFactors(int[] nums) {
        boolean[] a = new boolean[1001];
        int ans = 0;
        for (int x : nums) {
            for (int i = 2; i * i <= x; i++) {
                if (x % i == 0) {
                    if (!a[i]) {
                        a[i] = true;
                        ans++;
                    }
                    while (x % i == 0)
                        x /= i;
                }
            }
            if (x > 1 && !a[x]) {
                a[x] = true;
                ans++;
            }
        }
        return ans;
    }
}