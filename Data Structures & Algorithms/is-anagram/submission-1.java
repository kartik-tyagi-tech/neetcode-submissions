class Solution {
    public boolean isAnagram(String s, String t) {
             char[] s_array=s.toCharArray();
             Arrays.sort(s_array);
             
             char[] t_array=t.toCharArray();
             Arrays.sort(t_array);
             
          return Arrays.equals(t_array,s_array);      
    }
}
