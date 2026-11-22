class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m= new HashMap<>();
        for(String s:strs){
            char[] array=s.toCharArray();
            Arrays.sort(array);
            String sorted=new String(array);
            m.putIfAbsent(sorted,new ArrayList<>());
            m.get(sorted).add(s);
        }
        return new ArrayList<>(m.values());
    }
}
