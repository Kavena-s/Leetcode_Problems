class Solution {
    public boolean judgeCircle(String moves) {
        int u=0;
        int d=0;
        int l=0;
        int r=0;
        for(int i=0 ; i<moves.length() ; i++){
            if(moves.charAt(i) == 'U')
                u += 1;
            else if(moves.charAt(i) == 'D')        
                d += 1;
            else if(moves.charAt(i) == 'L')
                l += 1;
            else if(moves.charAt(i) == 'R')
                r += 1;
            else
                return false;
        }
        if( u == d && l == r)
            return true;
        return false;
    }
}
