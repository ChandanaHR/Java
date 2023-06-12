Given a sorted and rotated array A of N distinct elements which is rotated at some point, and given an element key. The task is to find the index of the given element key in the array A. The whole array A is given as the range to search.

Example 1:

Input:
N = 9
A[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}
key = 10
l = 0 , h = 8
Output:
5
Explanation: 10 is found at index 5.
Example 2:

Input:
N = 4
A[] = {3, 5, 1, 2}
key = 6
l = 0 , h = 3
Output:
-1
Explanation: There is no element that has value 6.
  
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        while(t>0)
        {
            int n = Integer.parseInt(in.readLine().trim());
            int[] A = new int[n];
            String s[]  = in.readLine().trim().split(" ");
            for(int i=0;i<n;i++)
            {
                A[i] = Integer.parseInt(s[i]);
            }
            int key = Integer.parseInt(in.readLine().trim());
            out.println(new Solution().rotate(A,0,n-1,key));
            t--;
        }
        out.close();
    }
}

class Solution {
    public int rotate(int A[],int l,int h,int key)
    {
        int low=l,high=h;
        while(low<=high)
        {
            int mid = (high+low)/2;
            if(A[mid]==key)
            {
                return mid;
            }
            if(A[low]<=A[mid])
            {
                if(key>=A[low] && key<A[mid])
                {
                    high = mid-1;
                }
                else
                {
                    low = mid+1;
                }
            }
            else if(A[high]>=A[mid])
            {
                if(key>A[mid] && key<=A[high])
                {
                    low = mid+1;
                }
                else
                {
                    high = high-1;
                }
            }
        }
        return -1;
    }
}
