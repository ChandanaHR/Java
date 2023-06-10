Given a sorted array arr[] of size N without duplicates, and given a value x. Floor of x is defined as the largest element K in arr[] such that K is smaller than or equal to x. Find the index of K(0-based indexing).

Example 1:

Input:
N = 7, x = 0 
arr[] = {1,2,8,10,11,12,19}
Output: -1
Explanation: No element less 
than 0 is found. So output 
is "-1".
Example 2:

Input:
N = 7, x = 5 
arr[] = {1,2,8,10,11,12,19}
Output: 1
Explanation: Largest Number less than 5 is
2 (i.e K = 2), whose index is 1(0-based 
indexing).
  
import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while(t>0)
        {
            String a[] = read.readLine().trim().split("\\s+");
            int n = Integer.parseInt(a[0]);
            long x = Long.parseLong(a[(int)1]);
            String st[] = read.readLine().trim().split("\\s+");
            long arr[] = new long[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = Long.parseLong(st[i]);
            }
            out.println(new Solution().findfloor(arr,n,x));
            t--;
        }
        out.close();
    }
}

class Solution {
    static int findfloor(long arr[],int n,long x)
    {
        int low=0,high=n-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]==x)
            {
                return mid;
            }
            if(arr[mid]>x)
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return high;
    }
}
