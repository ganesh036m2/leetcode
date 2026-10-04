class Solution {
    public int minFlips(int a, int b, int c) {
        int ans=0;
        while(a!=0 || b!=0 || c!=0)
        {
            int x=a&1;
            int y=b&1;
            int z=c&1;
            if(z==1)
            {
                if(x==0 && y==0)
                    ans++;
            }
            else
            {
                ans=ans+x+y;
            }
            a=a>>1;
            b=b>>1;
            c=c>>1;
        }
        return ans;
    }
}
