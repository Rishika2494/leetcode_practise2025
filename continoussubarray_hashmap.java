class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
    if(nums.length==1) return false;
    // stores the prefix sum and the occurence of the prefix sum. 
     HashMap<Integer,Integer> map= new HashMap<>();
     // it has 2 have length 2 and also sum has to be multiples of that number k 
    // we can use the concept of prefix sum where when 2 sums have been 
    int pf_sum=0;
    for(int i=0;i<nums.length;i++)
    {
       pf_sum=pf_sum+nums[i];
       int rem=pf_sum%k;
       if(rem==0 && i>=1) return true;
       if(map.containsKey(rem) && i-map.get(rem)>=2)
       return true; 
       else
       map.put(rem,i);
    }
    return false; 
    }
}
