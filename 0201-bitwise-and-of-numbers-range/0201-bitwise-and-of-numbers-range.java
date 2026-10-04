class Solution {
    public int rangeBitwiseAnd(int l, int r) {
        int x=0;
        while(l!=r)
        {
            l=l>>1;
            r=r>>1;
            x++;
        }
        return l<<x;
    }
}