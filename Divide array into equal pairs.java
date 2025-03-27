class Solution {
    public boolean divideArray(int[] nums) {
        for(int i=0 ; i<nums.length ; i++){
            int count = 1;
            for(int j=0 ; j<nums.length ; j++){
                if(i != j && nums[i] == nums[j])
                    count += 1;
            }
            if(count%2 == 1)
                return false;
        }
        return true;
    }
}
