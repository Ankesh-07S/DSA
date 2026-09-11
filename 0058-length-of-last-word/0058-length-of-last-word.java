class Solution {
    public int lengthOfLastWord(String s) {
        String l=s.trim();
        int i=l.length()-1;
        int count=0;
        while(l.charAt(i)!=' '){
            count++;
            if(i>=1)
            i=--i;
            else
            break;
        }
return count;
    }
}