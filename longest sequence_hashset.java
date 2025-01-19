class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer> set= new HashSet<Integer>();
        for(int num: nums)
            set.add(num);
        // now we are reducing the time complexity because hashset lookup is o(1)
        // checking if number is already a part of a sequence we counted
      int longest=1;
        int current_length=1;
        for(int i=0;i<nums.length;i++)
        {
           if(!set.contains(nums[i]-1)) 
           {
               int current= nums[i];
               current_length=1;
               while(set.contains(current+1))
               {
                   current= current+1;
                   current_length= current_length+1;
                   
               }
           }
            longest= Math.max(current_length,longest);
             }
        return longest;  
        }
    }
