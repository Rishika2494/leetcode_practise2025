class Solution {
    public int findMaxLength(int[] nums) {
    HashMap<Integer,Integer> map= new HashMap<>();
    map.put(0,-1);
    int count=0;
    int max=0;
    for(int i=0;i<nums.length;i++)
    {
    // we are calculating the running sum here for 1 and 0s
    if(nums[i]==0) count=count-1;
    else count=count+1;
    if(map.containsKey(count))
    max=Math.max(max,i-map.get(count));
    else
    map.put(count,i);
   }
    return max;
    }
}
