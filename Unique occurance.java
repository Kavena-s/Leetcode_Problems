class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] count = new int[arr.length];
        for(int i=0 ; i<arr.length ; i++){
            count[i] = -1;
        }
        for(int i=0 ; i<arr.length ; i++){
            int temp = 1;
            for(int j=0 ; j<arr.length ; j++){
                if(i!=j){
                    if(arr[i] == arr[j] && arr[i] != 1001){
                        arr[j] = 1001;
                        temp+=1;
                    }
                    if(arr[i] != 1001)
                        count[i] = temp;
                    }
            }
        }
        for(int i=0 ; i<count.length ; i++){
            for(int j=i+1 ; j<count.length ; j++){
                if(count[i] == count[j] && count[i] != -1)
                    return false;
            }
        }
        return true;
    }
}
