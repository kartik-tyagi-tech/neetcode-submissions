class Solution {
    public boolean isAnagram(String s, String t) {
             char[] s_array=s.toCharArray();
             Arrays.sort(s_array);
             String sortedS=new String(s_array);
             char[] t_array=t.toCharArray();
             Arrays.sort(t_array);
             String sortedT=new String(t_array);
             if(sortedS.equals(sortedT)){
                return true;
             }
             else{
                return false;
             }
             
             
             
    }
}
