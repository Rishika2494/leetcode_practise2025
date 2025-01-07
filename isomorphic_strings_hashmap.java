class Solution {
    public boolean isIsomorphic(String s, String t) {
     HashMap<Character,Character> s_t= new HashMap<>();
     HashMap<Character,Character> t_s= new HashMap<>();
     if(s.length()!=t.length()) return false;
     for(int i=0;i<s.length();i++)
     {
        if(!s_t.containsKey(s.charAt(i)))
        {
            s_t.put(s.charAt(i),t.charAt(i));
         }
         else if(s_t.containsKey(s.charAt(i)))
         {
            if(s_t.get(s.charAt(i))!=t.charAt(i)) return false;
         }
        if(!t_s.containsKey(t.charAt(i)))
        {
            t_s.put(t.charAt(i),s.charAt(i));
        }
        else if(t_s.containsKey(t.charAt(i)))
         {
            if(t_s.get(t.charAt(i))!=s.charAt(i)) return false;
         }
     }
     return true;
    }
}
