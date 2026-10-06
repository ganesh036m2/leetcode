class Solution {
    public int countTriplets(int[] arr) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int x = 0;
            for (int j = i; j < n; j++) {
                x ^= arr[j];
                if (x == 0)
                    ans += j - i;
            }
        }
        return ans;
    }
}