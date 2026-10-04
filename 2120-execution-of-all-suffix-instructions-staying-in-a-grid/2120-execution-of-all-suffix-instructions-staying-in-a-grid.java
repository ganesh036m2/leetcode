class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int m=s.length();
        int[] ans=new int[m];

        for(int i=0;i<m;i++)
        {
            int x=startPos[0];
            int y=startPos[1];
            int c=0;

            for(int j=i;j<m;j++)
            {
                char ch=s.charAt(j);

                if(ch=='L')
                    y--;
                else if(ch=='R')
                    y++;
                else if(ch=='U')
                    x--;
                else
                    x++;

                if(x<0 || x>=n || y<0 || y>=n)
                    break;

                c++;
            }

            ans[i]=c;
        }

        return ans;
    }
}