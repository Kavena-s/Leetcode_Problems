class Solution {
    public List<String> fizzBuzz(int n) {
        String[] array = new String[n];
        for(int i=0 ; i<n ; i++){
            if((i+1) % 3 == 0 && (i+1) % 5 == 0)
                array[i] = "FizzBuzz";
            else if((i+1) % 5 == 0)
                array[i] = "Buzz";
            else if((i+1) % 3 == 0)
                array[i] = "Fizz";
            else
                array[i] = String.valueOf(i+1);
        }
        return Arrays.asList(array);
    }
}
