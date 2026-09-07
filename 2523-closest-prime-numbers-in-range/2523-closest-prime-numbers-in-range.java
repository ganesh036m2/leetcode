class Solution {
    public boolean p(int m) {
        for (int i = 2; i <= Math.sqrt(m); i++) {
            if (m % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int[] closestPrimes(int left, int right) {
        int ans[] = new int[2];
        Arrays.fill(ans, -1);
        ArrayList<Integer> pr = new ArrayList<>();
        int fp = 0;
        int lp = 0;
        for (int i = left; i <= right; i++) {
            if (i > 1) {
                if (p(i)) {
                    pr.add(i);
                }
            }
        }
        Integer[] prime = pr.toArray(new Integer[0]);
        Arrays.sort(prime);
        int mi = Integer.MAX_VALUE;
        for (int i = 1; i < prime.length; i++) {
            int l = prime[i] - prime[i - 1];
            if (l < mi) {
                mi = Math.min(mi, l);
                fp = prime[i - 1];
                lp = prime[i];
            }
        }
        if (fp > 0 && lp > 0 && fp != lp) {
            ans[0] = fp;
            ans[1] = lp;
        }
        return ans;
    }
}