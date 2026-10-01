class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs)
        {
            char[] charArray=s.toCharArray();
            Arrays.sort(charArray);
            String sortedString=new String(charArray);
            List<String> group=map.getOrDefault(sortedString,new ArrayList<>());
            group.add(s);
            map.put(sortedString,group);

        }
        return new ArrayList<>(map.values());
    }
}