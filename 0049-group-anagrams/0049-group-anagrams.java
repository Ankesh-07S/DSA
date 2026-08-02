class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> mp = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            if (mp.containsKey(key)) {
                mp.get(key).add(strs[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                mp.put(key, list);
            }
        }

        return new ArrayList<>(mp.values());
    }
}