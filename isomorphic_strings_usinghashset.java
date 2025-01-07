isomorphic strings - but now we need to do it using a hashmap and a hashset.
class Solution {
    public boolean isIsomorphic(String s, String t) {
     HashMap<Character,Character> s_t= new HashMap<>();
     HashSet<Character> used = new HashSet<>();
     if(s.length()!=t.length()) return false;
     for(int i=0;i<s.length();i++)
     {
        char cs=s.charAt(i);
        char ct =t.charAt(i);
        if(s_t.containsKey(cs))
        {
            if(s_t.get(cs)!=ct) return false;
        }
     
        // lets put in all the elements of the mppings into the set.
        else{        
        if(used.contains(ct))
        {
        return false;
        }
        }
         s_t.put(cs,ct);
         used.add(ct);
    }
    return true;
}
}
