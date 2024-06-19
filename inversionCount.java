// https://www.geeksforgeeks.org/problems/inversion-of-array-1587115620/1 

import java.util.*;

class Main {
    public static void main(String[] args) {
        // Note: Don't change class name
        // your code goes here
    }
}

class Solution
{
    static long mergeAndCount(long arr[], long left[], long right[]) {
        int i = 0, j = 0, k = 0;
        long ans = 0;
        
        while(i < left.length && j < right.length) {
            if(left[i] <= right[j])
                arr[k++] = left[i++];
            else {
                ans += left.length - i; // add appropriate value to ans;
                arr[k++] = right[j++];
            }
        }

        while(i < left.length)
            arr[k++] = left[i++];
            
        while(j < right.length)
            arr[k++] = right[j++];
            
        return ans;
    }

    static long inversionCount(long arr[], long N)
    {
        if(N == 1)
            return 0;
        
        long left[] = Arrays.copyOfRange(arr, 0, (int)N/2);
        long right[] = Arrays.copyOfRange(arr, (int)N/2, (int)N);
        
        return inversionCount(left, left.length) + inversionCount(right, right.length) + mergeAndCount(arr, left, right);
    }
}