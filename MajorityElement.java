class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}

class MooresVotingAlgorithm {
    public int majorityElement(int[] nums) {
        int major = nums[0], count = 1;
        
        for(int i=1;i<nums.length;i++){
            if(count==0){
                count++;
                major=nums[i];
            }else if(major == nums[i])
                count++;
            else
                count--;   
        }
        return major;
    }
}

//Another approach is by using hashmap where key will be the array element and value be it's count
