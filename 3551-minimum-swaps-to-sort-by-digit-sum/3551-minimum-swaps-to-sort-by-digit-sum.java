class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++) 
          {
            int x=nums[i];
            int s=0;
            while(x>0)
            {
                s += x % 10;
                x /= 10;
            }
            arr[i][0]=nums[i];
            arr[i][1]=s;
        }
        Arrays.sort(arr,(a,b)->{
            if(a[1]!=b[1]) 
            {
                return a[1]-b[1];
            }
            return a[0]-b[0];
        });
        Map<Integer, Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++) 
        {
            mp.put(nums[i],i);
        }
        int ans=0;
        boolean[] vis=new boolean[n];
        for (int i=0;i<n;i++)
        {
            if(vis[i]) 
            {
                continue;
            }
            int j=i;
            int cnt=0;
            while(!vis[j]) 
            {
                vis[j]=true;
                j=mp.get(arr[j][0]);
                cnt++;
            }
            if(cnt>1) 
            {
                ans+=cnt-1;
            }
        }
        return ans;
    }
}
