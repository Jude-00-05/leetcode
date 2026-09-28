class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] charArr=s.toCharArray();
            Arrays.sort(charArr);
            String sortedCurr=new String(charArr);
            List<String> group =map.getOrDefault(sortedCurr,new ArrayList<>());
            group.add(s);
            map.put(sortedCurr,group);
        }

        return new ArrayList<>(map.values());
    }
}