class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int[] num = Arrays.copyOf(nums,nums.length);
        int[] diff = new int[nums.length];
        for(int i=0 ; i<nums.length ; i++){
            int pref = i+1 , suff = nums.length - i - 1;
            nums = Arrays.copyOf(num,num.length);
            for(int j=i ; j>0 ; j--){
                for(int k=j-1 ; k>=0 ; k--){
                    if(nums[j] == nums[k] && nums[j]!=0){
                        nums[k] = 0;
                        pref -= 1;
                    }
                }
            }
            for(int j=i+1 ; j<nums.length-1 ; j++){
                for(int k=j+1 ; k<nums.length ; k++){
                    if(nums[j] == nums[k] && nums[j]!=0){
                        nums[k] = 0;
                        suff -= 1;
                    }
                }
            }
            diff[i] = pref - suff;
        }
        return diff;
    }
}
