class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
                   for(String each:strs){
                         sb.append(each.length());
                         sb.append("#");
                         sb.append(each);
                   }
                   return sb.toString();
    }

    public List<String> decode(String str) {
                         int index=0;
                         List<String> list=new ArrayList<>();
                         while(index<str.length()){
                            int hash = str.indexOf("#",index);

                            int length = Integer.parseInt(str.substring(index,hash));

                            int start = hash +1;
                            int end = start +length;

                            String subString=str.substring(start,end);

                            list.add(subString);

                            index=end;
                         }  
                         return list;
    }
}
