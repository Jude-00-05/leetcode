class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String word:strs){
            char[] characters=word.toCharArray();
            Arrays.sort(characters);
            String key=new String(characters);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(word);

        }
        return new ArrayList<>(map.values());
    }
}