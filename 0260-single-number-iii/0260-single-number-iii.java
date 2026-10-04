class Solution {
    public int[] singleNumber(int[] a) {
        int x=0;
        for(int n:a)
            x=x^n;
        int b=x&-x;
        int p=0,q=0;
        for(int n:a)
        {
            if((n&b)!=0)
                p=p^n;
            else
                q=q^n;
        }
        return new int[]{p,q};
    }
}
