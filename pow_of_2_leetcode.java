public class pow_of_2_leetcode {
    public boolean isPowerOfTwo(int n) {

        
        if(n <= 0) 
            return false;

        while(n%2 == 0)
            n /= 2;
        
        boolean ans = (n == 1)? true : false;

        return ans;
    }
}
