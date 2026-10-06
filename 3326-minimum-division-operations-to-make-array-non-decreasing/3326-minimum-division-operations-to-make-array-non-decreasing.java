class Solution {
    public int minOperations(int[] nums) {
        int ans = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > nums[i + 1]) {
                int x = nums[i];
                int p = smallestPrime(x);
                if (p == x)
                    return -1;
                nums[i] = p;
                ans++;
                if (nums[i] > nums[i + 1])
                    return -1;
            }
        }
        return ans;
    }
    int smallestPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
               return i;
        }
        return n;
    }
}