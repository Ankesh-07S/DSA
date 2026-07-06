// Java isko todti hai:

// (arr[i] == 'a') || ('e')

// Ab soch:

// arr[i] == 'a' → boolean (true ya false)
// 'e' → char

// Aur || ko dono side boolean chahiye.

// Matlab Java ke liye ye ho gaya:

// true || 'e'

class Solution {

    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            if (isVowel(arr[i]) && isVowel(arr[j])) {
                swap(arr, i, j);
                i++;
                j--;
            }
            else if (!isVowel(arr[i])) {
                i++;
            }
            else {
                j--;
            }
        }

        return new String(arr);
    }

    private boolean isVowel(char ch) {

        return ch == 'a' ||
               ch == 'e' ||
               ch == 'i' ||
               ch == 'o' ||
               ch == 'u' ||
               ch == 'A' ||
               ch == 'E' ||
               ch == 'I' ||
               ch == 'O' ||
               ch == 'U';
    }

    private void swap(char[] arr, int i, int j) {

        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}