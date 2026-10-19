class Solution {
    public int hIndex(int[] c) {
        Arrays.sort(c);
        int n=c.length;
        for (int i=0;i<n;i++) 
        {
            int pa=n-i;
            if(c[i]>=pa) 
            {
                return pa;
            }
        }
        return 0;
    }
}
