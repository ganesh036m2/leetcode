
class Solution {
    public int maximumSaleItems(int[][] items,int budget) 
    {
        int n=items.length,m=0,min=Integer.MAX_VALUE;
        int[] cnt=new int[n+1];
        for(int[] a:items) 
        {
            cnt[a[0]]++;
            min=Math.min(min,a[1]);
            m=Math.max(m,a[0]);
        }
        for(int i=1;i<=m;i++) 
        {
            for (int j=i*2;j<=m;j+=i)
            {
                cnt[i]+=cnt[j];
            }
        }
        Arrays.sort(items,(a,b)->Integer.compare(a[1],b[1]));
        long ans=0;
        long b=budget;
        for (int[] a:items) 
        {
            int f=a[0],p=a[1];
            if (p>=2L*min) 
            {
                break;
            }
            long c=Math.min(cnt[f]-1,b/p);
            ans+=c*2;
            b-=c*p;
        }
        ans+= b/min;
        return (int) ans;
    }
}
