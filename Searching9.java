Given an integer x, find the square root of x. If x is not a perfect square, then return floor(√x).

 

Example 1:

Input:
x = 5
Output: 2
Explanation: Since, 5 is not a perfect 
square, floor of square_root of 5 is 2.
Example 2:

Input:
x = 4
Output: 2
Explanation: Since, 4 is a perfect 
square, so its square root is 2.
  
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            long a = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.squareroot(a));
            t--;
        }
    }
}

class Solution {
    public long squareroot(long x)
    {
        long low=0,high=x;
		while(low<=high)
		{
		    long mid = low+(high-low)/2;
		    if(mid*mid<=x && (mid+1)*(mid+1)>x)
		    {
		        return mid;
		    }
		    else if(mid*mid > x)
		    {
		        high = mid-1;
		    }
		    else
		    {
		        low = mid+1;
		    }
		}
		return -1;
    }
}
