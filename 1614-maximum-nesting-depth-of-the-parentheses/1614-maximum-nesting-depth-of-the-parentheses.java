
// ' ' (single quotes) → char
// " " (double quotes) → String

class Solution {
    public int maxDepth(String s) {
         int n=s.length();
         int depth=0;
         int predepth=0;
         for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){   ///yaha par "for string" and 'fpr charater' aur s. se karenge direct nahi aarray jaise
              depth++;
              predepth=Math.max(depth,predepth);
            }
            else if(s.charAt(i)==')'){
                depth--;
            }
            else{
            if(i==n-1&& depth==0&&predepth==0){
                return 0;
            }
            continue;
            }
         }
         return predepth;
    }
}