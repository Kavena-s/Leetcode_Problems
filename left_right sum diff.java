class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0 ; i<nums.length ; i++){
            int left = 0;
            int right = 0;
            for(int j=0 ; j<nums.length ; j++){
                if(j<i)
                    left += nums[j];
                else if(j>i)
                    right += nums[j];
            }
            result[i] = Math.abs(right - left);
        }
        return result;
    }
}
