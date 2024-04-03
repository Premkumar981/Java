// https://www.geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array3226/1

public class min_and_2nd_min_gfg {
    public long[] minAnd2ndMin(long arr[], long N)  
    {
        long min_element = (int) Integer.MAX_VALUE;
        long sec_min = (int) Integer.MAX_VALUE;

        for(int i = 0; i < N; ++i) {
            if(arr[i] < min_element) {
                sec_min = min_element;
                min_element = arr[i];
            }
            else if(arr[i] != min_element && arr[i] < sec_min) {
                sec_min = arr[i];
            }
        }

        if(sec_min == Integer.MAX_VALUE) {
            min_element = -1;
            sec_min = -1;
        }
        
        long ans[] = {min_element, sec_min};
        
        return ans;
    }
}
