Given a sorted array of size N and an integer K, find the position(0-based indexing) at which K is present in the array using binary search.

Example 1:

Input:
N = 5
arr[] = {1 2 3 4 5} 
K = 4
Output: 3
Explanation: 4 appears at index 3.

Example 2:

Input:
N = 5
arr[] = {11 22 33 44 55} 
K = 445
Output: -1
Explanation: 445 is not present.
  
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr,n,key));
            t--;
        }
    }
}

class Solution {
    public int binarysearch(int arr[],int n,int k)
    {
        int low=0,high=n-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]==k)
            {
                return mid;
            }
            else if(arr[mid]<k)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return -1;
    }
}
