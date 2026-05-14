class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String,List<String>> map=new HashMap<>();
        for(String each: strs){
            char arr[]=each.toCharArray();
            Arrays.sort(arr);
            String newString=new String(arr);
            if(!map.containsKey(newString)){
                map.put(newString,new ArrayList<>());
            }
            map.get(newString).add(each);
        }
        return new ArrayList<>(map.values());
    }
}
