class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count=new HashMap<>();
        for(int num:nums){
            count.put(num, count.getOrDefault(num,0)+1);
        }

        int arr[][]=new int[count.size()][2];
        int id=0;

        for(int num:count.keySet()){
            arr[id][0]=count.get(num);
            arr[id][1]=num;
            id++;
        }
        Arrays.sort(arr,(a,b)->Integer.compare(b[0],a[0]));

        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=arr[i][1];
        }
        return res;
    }
}
