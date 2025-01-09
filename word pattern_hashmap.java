//word pattern 
//abba - dog cat cat dog
class Solution {
    public boolean wordPattern(String pattern, String s) {
       // hashmap to map character in pattern to s string
       String[] words = s.split(" ");
       HashMap<Character,String> map= new HashMap<>();
       HashMap<String,Character> maps= new HashMap<>();
       char[] chars= pattern.toCharArray();
     if(pattern.length()!=words.length) return false;
     // loop through each pattern and also loop through words
     // check mappings from character to string 
     for(int i=0;i<words.length;i++)
     {
        char ch= pattern.charAt(i);
        String str= words[i];
        if(!map.containsKey(ch))
        map.put(ch,str);
        if(map.containsKey(ch))
        {
            if(!map.get(ch).equals(str)) 
            {
                System.out.println(i);
                System.out.println(ch);
                System.out.println(str);
                System.out.println(map);
            return false;
            }
        }
        
     }
     // we also need to check string to character mapping

    for(int i=0;i<words.length;i++)
     {
        char ch= pattern.charAt(i);
        String str= words[i];
        if(!maps.containsKey(str))
        maps.put(str,ch);
        if(maps.containsKey(str))
        {
            if(!maps.get(str).equals(ch)) return false;
        }
     }
    return true;
     }
    }
