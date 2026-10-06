class Solution {
    public int subsetXORSum(int[] nums) {
        int ans = 0;
        for (int x : nums)
            ans |= x;
        return ans << (nums.length - 1);
    }
}