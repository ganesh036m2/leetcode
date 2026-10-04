class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;

        List<List<Integer>> a=new ArrayList<>();

        for(int i=0;i<m;i++)
        {
            a.add(new ArrayList<>());
            for(int j=0;j<n;j++)
            {
                a.get(i).add(0);
            }
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int x=(i*n+j+k)%(m*n);
                a.get(x/n).set(x%n,grid[i][j]);
            }
        }

        return a;
    }
}