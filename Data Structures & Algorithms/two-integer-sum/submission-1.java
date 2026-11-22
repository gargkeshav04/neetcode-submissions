class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> s=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            s.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int left=target-nums[i];
            if(s.containsKey(left) && s.get(left)!=i){
                return new int[] {i,s.get(left)};
            }
        }
        return new int[] {};
    }
}
