class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,res=0;
        HashMap<Character,Integer>mp=new HashMap<>();
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            mp.put(c,mp.getOrDefault(c,0)+1);
            int count=0;
            for(int freq:mp.values()){
                count=Math.max(count,freq);
            }
            while((r-l+1)-count>k){
                char left=s.charAt(l);
                mp.put(left, mp.get(left) - 1);
                l++;
                count=0;
                for(int freq:mp.values()){
                    count=Math.max(count,freq);
                }
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
