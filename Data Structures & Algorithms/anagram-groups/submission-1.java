class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp=new HashMap<>();
        for(String s:strs){
            char[] array=s.toCharArray();
            Arrays.sort(array);
            String sorted=new String(array);
            mp.putIfAbsent(sorted,new ArrayList<>());
            mp.get(sorted).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}
