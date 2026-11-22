class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int count=0;
        for(int num:nums){
            if(num!=0){
                product*=num;
            }
            else{
                count++;
            }
        }

        int[] res=new int[nums.length];
        if (count >1){
            Arrays.fill(res,0);
            return res;
        }
        else if(count==1){
            int i=0;
            for(int num:nums){
                res[i]=(num==0)?product:0;
                i++;
            }
            return res;
        }
        else{
            int i=0;
            for(int num:nums){
                res[i]=product/num;
                i++;
            }
            return res;
        }
    }
}  
