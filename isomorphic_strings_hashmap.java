class Solution {
    public boolean isIsomorphic(String s, String t) {
     HashMap<Character,Character> s_t= new HashMap<>();
     HashMap<Character,Character> t_s= new HashMap<>();
     if(s.length()!=t.length()) return false;
     for(int i=0;i<s.length();i++)
     {
        char cs=s.charAt(i);
        char ct =t.charAt(i);
        if(s_t.containsKey(cs))
        {
            if(s_t.get(cs)!=ct) return false;
        }
        else{
             s_t.put(cs,ct);
        }
        if(t_s.containsKey(ct))
        {
            if(t_s.get(ct)!=cs) return false;
        }
        else
        {
            t_s.put(ct,cs);
        }
    }
    return true;
}
}
