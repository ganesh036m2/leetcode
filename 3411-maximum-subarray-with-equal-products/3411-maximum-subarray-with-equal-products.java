class Solution {
    public int gcd(int a,int b) {
        while(b!=0) {
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }

    public int lcm(int a,int b) {
        return (a/gcd(a,b))*b;
    }

    public int maxLength(int[] nums) {
        int n=nums.length;
        int ans=0;

        for(int i=0;i<n;i++) {
            int g=0,l=1,p=1;

            for(int j=i;j<n;j++) {
                g=gcd(g,nums[j]);
                l=lcm(l,nums[j]);
                p*=nums[j];

                int len=j-i+1;

                if(p==g*l) {
                    ans=Math.max(ans,len);
                }
            }
        }
        return ans;
    }
}