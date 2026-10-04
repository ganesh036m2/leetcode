class Solution {
    public int[][] rotateGrid(int[][] a, int k) {
        int m=a.length;
        int n=a[0].length;

        int t=0,b=m-1,l=0,r=n-1;

        while(t<b && l<r)
        {
            int len=2*(b-t+r-l);
            int[] x=new int[len];
            int p=0;

            for(int j=l;j<=r;j++)
                x[p++]=a[t][j];

            for(int i=t+1;i<=b;i++)
                x[p++]=a[i][r];

            for(int j=r-1;j>=l;j--)
                x[p++]=a[b][j];

            for(int i=b-1;i>t;i--)
                x[p++]=a[i][l];

            int z=k%len;
            p=0;

            for(int j=l;j<=r;j++)
                a[t][j]=x[(p++ + z)%len];

            for(int i=t+1;i<=b;i++)
                a[i][r]=x[(p++ + z)%len];

            for(int j=r-1;j>=l;j--)
                a[b][j]=x[(p++ + z)%len];

            for(int i=b-1;i>t;i--)
                a[i][l]=x[(p++ + z)%len];

            t++;
            b--;
            l++;
            r--;
        }

        return a;
    }
}