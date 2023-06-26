Given an integer array of which both the first halve and second halve are sorted. The task is to merge these two sorted halves of the array into a single sorted array.
Note: The two halves can be of arbitrary sizes (i.e. if first halve of size k then the second halve is of size N-k where 0<=k<=N).

Example 1:

Input:
N = 6
arr[] = {2 3 8 -1 7 10}
Output: -1 2 3 7 8 10 
Explanation: {2 3 8} and {-1 7 10} are sorted 
in the original array. The overall sorted 
version is {-1 2 3 7 8 10}
Example 2:

Input:
N = 5
arr[] = {-4 6 9 -1 3}
Output: -4 -1 3 6 9 
Explanation: {-4 -1} and {3 6 9} are sorted 
in the original array. The overall sorted 
version is {-4 -1 3 6 9}

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt ();

    		new Solution().sortHalves (arr, n);
    	    for (int i = 0; i < n; ++i)
    	        System.out.print (arr[i] + " ");
    	    System.out.println ();
        }
        
    }
}

// Contributed By: Pranay Bansal
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static void sortHalves (int arr[], int n)
    {
        // your code here
        int temp[] = new int[n];
        int mid=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                mid = i+1;
                break;
            }
        }
        int i=0,j=mid,k=0;
        while(i<mid && j<n)
        {
            if(arr[i]<arr[j])
            {
                temp[k++] = arr[i++];
            }
            else
            {
                temp[k++] = arr[j++];
            }
        }
        while(i<mid)
        {
            temp[k++] = arr[i++];
        }
        while(j<n)
        {
            temp[k++] = arr[j++];
        }
        for(i=0;i<n;i++)
        {
            arr[i] = temp[i];
        }
    }
}
