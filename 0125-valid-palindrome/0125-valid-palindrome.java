class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int i = 0, j = n - 1;

        while (i <= j) {
            char a = Character.toLowerCase(s.charAt(i));
            char b = Character.toLowerCase(s.charAt(j));

            if (Character.isLetterOrDigit(a) && Character.isLetterOrDigit(b) && a == b) {
                i++;
                j--;
            } 
            else if (Character.isLetterOrDigit(a) && Character.isLetterOrDigit(b) && a != b) {
                return false;
            } 
            else if (Character.isLetterOrDigit(a) && !Character.isLetterOrDigit(b)) {
                j--;
            } 
            else if (!Character.isLetterOrDigit(a) && !Character.isLetterOrDigit(b)) {
                i++;
                j--;
            } 
            else {
                i++;
            }
        }
        return true;
    }
}