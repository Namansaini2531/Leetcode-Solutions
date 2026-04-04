class ReverseInt {  // rename ReverseInt -> Solution in Leetcode.
    public int reverse(int x) {

        int rev = 0;
        while(x!=0){
            int d = x % 10 ;
            if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10) return 0;
            //so that the reverse number do not exceed the constraints
            rev = rev * 10 + d ;
            x = x/10;
        }   
        return rev; 
    }
}
