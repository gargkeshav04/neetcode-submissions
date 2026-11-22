class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int other=target-nums[i];
            if(mp.containsKey(other) && i!= mp.get(other)){
                return new int[] {i,mp.get(other)};
            }
        }
        return new int[] {};
    }
}
