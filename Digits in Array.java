class Solution {
    public int[] separateDigits(int[] nums) {
        String[] s1 = new String[nums.length];
        for(int i=0 ; i<nums.length ; i++){
            s1[i] = String.valueOf(nums[i]);
        }
        String str = String.join("",s1);
        System.out.println(str);
        String[] temp = str.split("");
        System.out.println(Arrays.toString(temp));
        int[] num = new int[temp.length];
        for(int i=0 ; i<temp.length ; i++ ){
            num[i] = Integer.valueOf(temp[i]);
        }
        return num;
    }
}
