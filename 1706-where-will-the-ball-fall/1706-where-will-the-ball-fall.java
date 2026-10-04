class Solution {
    public int[] findBall(int[][] a) {
        int m=a.length;
        int n=a[0].length;
        int[] ans=new int[n];

        for(int j=0;j<n;j++)
        {
            int x=0;
            int y=j;

            while(x<m)
            {
                int z=y+a[x][y];

                if(z<0 || z>=n || a[x][y]!=a[x][z])
                {
                    y=-1;
                    break;
                }

                y=z;
                x++;
            }

            ans[j]=y;
        }

        return ans;
    }
}