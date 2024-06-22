// https://leetcode.com/contest/weekly-contest-386/problems/find-the-largest-area-of-square-inside-two-rectangles/

class Main {
    public static void main(String[] args) {
        // Note: Don't change class name
        // your code goes here
    }
}

class Solution {
    int common(int l1, int r1, int l2, int r2) {
        int ans = Math.min(r1, r2) - Math.max(l1, l2);
        return Math.max(ans, 0);
    }
    
    public long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
        long ans = 0;

        for(int i = 0; i < bottomLeft.length; ++i)
            for(int j = i + 1; j < bottomLeft.length; ++j) {
                
                // (xibl,yibl) | (xitr, yitr);
                // (xjbl,yjbl) | (xjtr, yjtr);
                
                long len = Math.min(common(bottomLeft[i][0], topRight[i][0], bottomLeft[j][0], topRight[j][0]), common(bottomLeft[i][1], topRight[i][1], bottomLeft[j][1], topRight[j][1]));
                ans = Math.max(ans, len*len);
            }
        
            return ans;
        }
    }