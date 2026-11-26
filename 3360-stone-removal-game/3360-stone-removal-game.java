class Solution {
    public boolean canAliceWin(int n) {
       String ans="a";
       for(int i=10;i>0;i--)
       {
          if(n>=i)
          {
            if(ans=="a")
            {
                n=n-i;
                ans="b";
            }
            else
            {
                n=n-i;
                ans="a";
            }
          }
          else
          {
            break;
          }
       }
       if(ans=="a")
       {
         return false;
       }
       return true;
    }
}