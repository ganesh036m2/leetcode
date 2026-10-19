class Solution {
    public int maxArea(int[] h) {
        int ma=0;
        int l=0;
        int r=h.length-1;
        while(l<r) 
        {
            int w=r-l;
            int mi=Math.min(h[l],h[r]);
            int cu=mi*w;
            ma=Math.max(ma,cu);
            if(h[l]<h[r]) 
            {
                l++;
            } else 
            {
                r--;
            }
        }
        return ma;
    }
}
