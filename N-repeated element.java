class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = (int)nums.length/2;
        for(int i=0 ; i<nums.length-1 ; i++){
            int count = 1;
            for(int j=i+1 ; j<nums.length ; j++){
                if(nums[i] == nums[j])
                    count += 1;
            }
            if(count == n)
                return nums[i];
        }
        return -1;
    }
}
