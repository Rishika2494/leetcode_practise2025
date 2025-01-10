
// Longest palindrome - using hashmap character count - 2 pass solution 
class Solution {
    public int longestPalindrome(String s) {
     // using a hashmap where i can store the frequency of the characters in a hashmap.
     HashMap<Character,Integer> map = new HashMap<>();
     char[] chars= s.toCharArray();
     boolean hasOdd = false;
     for( char ch : chars)
     {
        if(!map.containsKey(ch))
        map.put(ch,1);
        else
        map.put(ch,map.get(ch)+1);
     }
     int count=0;
     for(Integer val : map.values())
    {
      if(val%2==0) count= count+val;
      else
      {
      count= count+(val-1);
      hasOdd= true;
      }
     }
     if(hasOdd) count=count+1;

     return count;
    }

}
