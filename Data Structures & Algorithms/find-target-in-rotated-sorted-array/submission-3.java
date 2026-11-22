class Solution {
    public int search(int[] nums, int target) {
        int l=0,r=nums.length-1;
            while(l<r){
                int m=l+(r-l)/2;
                if(nums[m]>nums[r]){
                    l=m+1;
                }else{
                    r=m;
                }
            }
            r=nums.length-1;
            int p=l;
            l=0;
            if(target>=nums[p]&& target<=nums[r]){
                l=p;
            }else{
                r=p-1;
            }

            while (l <= r) {
            int m = (l + r) / 2;
            if (nums[m] == target) {
                return m;
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }
}
