class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        while(n>0){
            if(n%2 == 0){
                sum = sum - (n%10);
            }
            else{
                sum = sum + (n%10);
            }
            n /= 10;
        }
        return sum;
    }
}
