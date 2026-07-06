class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st =new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else if(i>0 && st.peek()!=s.charAt(i)){
                st.push(s.charAt(i));
            }
            else 
            st.pop();
        }
        StringBuilder sb = new StringBuilder();
          for (char ch : st) {
          sb.append(ch);
        }
       return sb.toString();
    }
}