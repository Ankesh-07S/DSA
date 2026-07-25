class Solution {
    public int firstUniqChar(String s) {
        char index = 0;
        LinkedHashMap<Character, Integer> mp = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (mp.containsKey(s.charAt(i))) {
                mp.put(s.charAt(i), mp.get(s.charAt(i)) + 1);
            } else {
                mp.put(s.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            if (entry.getValue() == 1) {
                index = entry.getKey();
                break;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (index == s.charAt(i)) {
                return i;
            }
        }

        return -1;
    }
}