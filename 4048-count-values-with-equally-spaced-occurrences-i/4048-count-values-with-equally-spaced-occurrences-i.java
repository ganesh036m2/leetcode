import java.util.*;
import java.lang.*;

class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer, ArrayList<Integer>> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!mp.containsKey(nums[i]))
            {
                mp.put(nums[i],new ArrayList<>());
            }
            mp.get(nums[i]).add(i);
        }
        int ans=0;
        for(ArrayList<Integer> a : mp.values())
        {
            if(a.size()==3)
            {
                if(a.get(0)+a.get(2)==2*a.get(1))
                {
                    ans++;
                }
            }
        }
        return ans;
    }
}