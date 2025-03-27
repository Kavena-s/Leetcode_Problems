class Solution {
    public int findMiddleIndex(int[] nums) {
        int pref , suff;
        for(int i=0;i<nums.length;i++){
            pref=0;
            suff=0;
            for(int j=0; j<i ; j++) {
                pref = pref+nums[j];
            }
            for(int j=i+1 ; j<nums.length ; j++){
                suff = suff+nums[j];
            }
            if(pref == suff)
                return i;
        }
        return -1;
    }
}
