class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans=0;
        for(int n:nums)
         {
            int sum=0;
            int cnt=0;
            for(int i=1;i*i<=n;i++)
            {
                if(n%i==0) 
                {
                    sum+=i;
                    cnt++;
                    if (i!=n/i)
                    {
                        sum+=n/i;
                        cnt++;
                    }
                }
                if(cnt>4) 
                {
                    break;
                }
            }
            if (cnt==4)
            {
                ans+=sum;
            }
        }
        return ans;
    }
}