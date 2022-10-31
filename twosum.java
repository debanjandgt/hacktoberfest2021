class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>mp=new HashMap<>();
        int return_array[]=new int[2];
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(target-nums[i]))
            {
                return_array[0]=mp.get(target-nums[i]);
                return_array[1]=i;
                break;
                
            }
            else{
                mp.put(nums[i],i);
            }
        }
        return(return_array);
    }
}
