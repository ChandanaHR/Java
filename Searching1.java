Given an array Arr of N elements and a integer K. Your task is to return the position of first occurence of K in the given array.
Note: Position of first element is considered as 1.

Example 1:

Input:
N = 5, K = 16
Arr[] = {9, 7, 2, 16, 4}
Output: 4
Explanation: K = 16 is found in the
given array at position 4.
Example 2:

Input:
N = 7, K = 98
Arr[] = {1, 22, 57, 47, 34, 18, 66}
Output: -1
Explanation: K = 98 isn't found in
the given array.
  
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t>0)
        {
            String[] str = br.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            int k = Integer.parseInt(str[1]);
            str = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = Integer.parseInt(str[i]);
            }
            int ans = new Solution().search(n,k,arr);
            System.out.println(ans);
            t--;
        }
    }
}

class Solution {
    public int search(int n,int k,int arr[])
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==k)
            {
                return i+1;
            }
        }
        return -1;
    }
}
