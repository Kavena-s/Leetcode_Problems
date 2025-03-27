class Solution {
    public int differenceOfSum(int[] nums) {
        int es = 0 ;
        int ds = 0;
        for(int i=0 ; i<nums.length ; i++){
            es = es + nums[i];
            while(nums[i]>0){
                int temp  = nums[i]%10;
                ds = ds + temp;
                nums[i] = nums[i] / 10;
            }
        }
        return es-ds;
    }
}
