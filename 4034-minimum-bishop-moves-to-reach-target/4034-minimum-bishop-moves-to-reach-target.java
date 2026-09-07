class Solution {
    public int minBishopMoves(int[] s, int[] t) {
        int d1=Math.abs(s[0]-t[0]);
        int d2=Math.abs(s[1]-t[1]);
        if(d1==d2)
        {
            return 1;
        }
        else if(((s[1]+s[0])%2)!=((t[1]+t[0])%2))
        {
            return -1;
        }
        else
        {
            return 2;
        }
    }
}