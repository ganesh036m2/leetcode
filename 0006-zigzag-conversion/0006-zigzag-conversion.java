class Solution {
    public String convert(String s, int n) {
        if(n==1 || n>=s.length())
            return s;

        StringBuilder a=new StringBuilder();

        for(int i=0;i<n;i++)
        {
            int x=2*(n-1);

            for(int j=i;j<s.length();j+=x)
            {
                a.append(s.charAt(j));

                int k=j+x-2*i;

                if(i!=0 && i!=n-1 && k<s.length())
                    a.append(s.charAt(k));
            }
        }

        return a.toString();
    }
}