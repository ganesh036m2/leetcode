class Solution {
    public int[] asteroidCollision(int[] a) {
        int[] s=new int[a.length];
        int t=0;

        for(int x:a)
        {
            boolean ok=true;

            while(t>0 && s[t-1]>0 && x<0)
            {
                if(s[t-1]<-x)
                {
                    t--;
                }
                else if(s[t-1]==-x)
                {
                    t--;
                    ok=false;
                    break;
                }
                else
                {
                    ok=false;
                    break;
                }
            }

            if(ok)
                s[t++]=x;
        }

        int[] ans=new int[t];

        for(int i=0;i<t;i++)
            ans[i]=s[i];

        return ans;
    }
}