//use a hashset and remove the element whenever there is a repition. this is 1 pass solution 
class Solution {
    public int longestPalindrome(String s) {
     // using a hashmap where i can store the frequency of the characters in a hashmap.
     HashSet<Character> set = new HashSet<>();
     char[] chars= s.toCharArray();
     boolean hasOdd = false;
     int count=0;
     for( char ch : chars)
     {
        if(!set.contains(ch))
        set.add(ch);
        else
        {
        count= count+2;
        set.remove(ch);
     }
    }
     if(!set.isEmpty()) count=count+1;

     return count;
    }

}
