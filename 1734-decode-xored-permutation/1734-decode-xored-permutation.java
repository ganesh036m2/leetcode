class Solution {
    public int[] decode(int[] encoded) {
        int n = encoded.length + 1;
        int[] ans = new int[n];
        int x = 0;
        for (int i = 1; i <= n; i++)
            x ^= i;
        for (int i = 1; i < encoded.length; i += 2)
            x ^= encoded[i];
        ans[0] = x;
        for (int i = 0; i < encoded.length; i++)
            ans[i + 1] = ans[i] ^ encoded[i];
        return ans;
    }
}