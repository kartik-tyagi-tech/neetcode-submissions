class Solution {

    public String countFrequency(String st){
        int arr[]=new int[26];
        for(char each:st.toCharArray()){
            arr[each-'a']++;
        }
        StringBuilder frequencyString=new StringBuilder();
        char c='a';
        for(int each:arr){
            frequencyString.append(c);
            frequencyString.append(each);
            c++;
        }
        return frequencyString.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        for(String each:strs){
               String current=countFrequency(each);
               if(!map.containsKey(current)){
                map.put(current,new ArrayList<>());
               }
               map.get(current).add(each);

        }
        return new ArrayList<>(map.values());
    }
}
