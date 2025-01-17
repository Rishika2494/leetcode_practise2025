class Solution {
    public List<Integer> findDuplicates(int[] nums) {
      List<Integer> result = new ArrayList<Integer>();
      //here we can use the concept of making the arrays as -1 if visited
        for(int i=0;i<nums.length;i++)
        {
            int idx= Math.abs(nums[i]);
            if(nums[idx-1]>0)
            nums[idx-1]= nums[idx-1]*-1;
            else
            {
            result.add(idx);
            }
        }
       return result;
}
}
