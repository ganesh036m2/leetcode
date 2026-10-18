class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
         double d1=Math.sqrt((Math.pow(Math.abs(p1[0]-p2[0]),2))+(Math.pow(Math.abs(p1[1]-p2[1]),2)));
         double d2=Math.sqrt((Math.pow(Math.abs(p3[0]-p4[0]),2))+(Math.pow(Math.abs(p3[1]-p4[1]),2)));
         double d3=Math.sqrt((Math.pow(Math.abs(p1[0]-p3[0]),2))+(Math.pow(Math.abs(p1[1]-p3[1]),2)));
         double d4=Math.sqrt((Math.pow(Math.abs(p4[0]-p2[0]),2))+(Math.pow(Math.abs(p4[1]-p2[1]),2)));
         double d5=Math.sqrt((Math.pow(Math.abs(p1[0]-p4[0]),2))+(Math.pow(Math.abs(p1[1]-p4[1]),2)));
         double d6=Math.sqrt((Math.pow(Math.abs(p3[0]-p2[0]),2))+(Math.pow(Math.abs(p3[1]-p2[1]),2)));
         if(d1>0 && d2>0 && d3>0 && d4>0 && d5>0 && d6>0)
         {
         if(d1==d2 && d6==d4 && d4==d3)
         {
            return true;
         }
         else if(d3==d4 && d5==d1 && d6==d2)
         {
         return true;
         }
         else if(d5==d6 && d1==d3 && d2==d4 && d4==d3)
         {
            return true;
         }
         else
         {
            return false;
         }
         }
         else
         {
            return false;
         }
    }
}