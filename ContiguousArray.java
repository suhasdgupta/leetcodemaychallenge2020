class ContiguousArray {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
            if(nums[i] == 0) nums[i]=-1;
        
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(0,-1);
        int sum=0,max=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(map.containsKey(sum)){
                max=Math.max(max,i-map.get(sum));
            }else
                map.put(sum,i);
        }
        return max;
    }
}
