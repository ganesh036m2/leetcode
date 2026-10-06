class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int ones = 0;

        for (int x : nums) {
            if (x == 1)
                ones++;
        }

        if (ones > 0)
            return n - ones;

        int len = n + 1;

        for (int i = 0; i < n; i++) {
            int g = 0;

            for (int j = i; j < n; j++) {
                g = gcd(g, nums[j]);

                if (g == 1) {
                    len = Math.min(len, j - i + 1);
                    break;
                }
            }
        }

        if (len == n + 1)
            return -1;

        return len - 1 + n - 1;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}