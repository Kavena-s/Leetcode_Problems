class Solution {
    public int findMaxK(int[] nums) {
        int num=-1;
        for(int i=0 ; i<nums.length ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                if(nums[i] == nums[j]* -1 || nums[i]* -1 == nums[j]){
                    if(Math.abs(nums[i]) > num)
                        num = Math.abs(nums[i]);
                }
            }
        }
        return num;
    }
}
