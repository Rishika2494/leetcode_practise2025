// using the concept of sorting the strings to store as key in the hashmap
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     //List<List<String>> result= new ArrayList<List<String>>();
     HashMap<String,List<String>> map= new HashMap<>();
     for(int i=0;i<strs.length;i++)
    {
     String current= strs[i];
     char[] charArray = current.toCharArray();
     Arrays.sort(charArray);
     String sorted= String.valueOf(charArray);
 // iterate over the mappings map and then add it to the list 
    if(map.containsKey(sorted))
        map.get(sorted).add(current);
    else
    {
        // add a new list to the map and 
        ArrayList<String> list= new ArrayList<String>();
        list.add(current);
        map.put(sorted,list);
    
    }
     //return new ArrayList<>(mappings.values());
    } 
    return new ArrayList<>(map.values());
    }
     
    }
