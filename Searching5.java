Given a sorted array Arr of size N and a number X, you need to find the number of occurrences of X in Arr.

Example 1:

Input:
N = 7, X = 2
Arr[] = {1, 1, 2, 2, 2, 2, 3}
Output: 4
Explanation: 2 occurs 4 times in the
given array.
Example 2:

Input:
N = 7, X = 4
Arr[] = {1, 1, 2, 2, 2, 2, 3}
Output: 0
Explanation: 4 is not present in the
given array.
  
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while(tc>0)
        {
            String inputline[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputline[0]);
            int x = Integer.parseInt(inputline[1]);
            int[] arr = new int[n];
            inputline = br.readLine().trim().split(" ");
            for(int i=0;i<n;i++)
            {
                arr[i] = Integer.parseInt(inputline[i]);
            }
            int ans = new Solution().count(arr,n,x);
            System.out.println(ans);
            tc--;
        }
    }
}

class Solution {
    public int count(int arr[],int n,int x)
    {
        int low=0,high=n-1,count=0;
        while(low<=high)
        {
           if(arr[low]==x)
           {
               count++;
               low = low+1;
           }
           else if(arr[high]==x)
           {
               count++;
               high = high-1;
           }
           else
           {
               low = low+1;
               high = high-1;
           }
        }
        return count;
    }
}
