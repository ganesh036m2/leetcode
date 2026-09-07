class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
for(int left=1;left<n;left++){
        for(int right=left;right<n;right++){
            int sum=nums[right-left]+nums[right];
            if(sum==target){
                return new int[]{right-left,right};
            }
        }
    }
    return new int[]{};
}
}