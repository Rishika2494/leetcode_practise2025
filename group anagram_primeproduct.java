// do the prime product implementation of string under the hood of a hahsmap. 

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double,List<String>> map= new HashMap<>();
double pp=1;
  for(String str : strs)
  {
    pp= primeproduct(str);
       if(!map.containsKey(pp))
       {
    ArrayList<String> list= new ArrayList<>();
       map.put(pp,list);
       }
       map.get(pp).add(str);
  }
  return new ArrayList<>(map.values());
    }

// this is under the hood implementaion of strings being stored as keys in hashmap
    public double primeproduct(String s)
    {
    double result=1;
    int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,103};
    for(int i=0;i<s.length();i++)
    {
      char c= s.charAt(i);
    result= result* primes[c-'a'];  
    }
    return result;
    }
}
