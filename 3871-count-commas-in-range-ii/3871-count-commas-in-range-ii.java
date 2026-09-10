class Solution {
    public long countCommas(long n) {
        long ans=0;
        int p=3;
        while( n>=Math.pow(10,p))
        {
            if(n<Math.pow(10,p+3))
            {
                ans=ans+(long)(n-(Math.pow(10,p)-1));
            }
            else
            {
                ans=ans+(long)(n-Math.pow(10,p)+1);
            }
            p=p+3;
        }
        return ans;
    }
}