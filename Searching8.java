Find the missing element from an ordered array arr[], consisting of N elements representing an Arithmetic Progression(AP).

Note: There always exists an element which upon inserting into sequence forms Arithmetic progression. Boundary elements (first and last elements) are not missing.

Example 1:

Input:
N = 6
Arr[] = {2, 4, 8, 10, 12, 14}
Output: 6
Explanation: Actual AP should be 
2, 4, 6, 8, 10, 12, 14.

Example 2:

Input:
N = 6
Arr[] = {1, 6, 11, 16, 21, 31}
Output: 26
Explanation: Actual AP should be 
1, 6, 11, 16, 21, 26, 31.

  
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while(tc>0)
        {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for(int i=0;i<n;i++)
            {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().missing(arr,n);
            System.out.println(ans);
            tc--;
        }
    }
}

class Solution {
    public static int missing(int arr[],int n)
    {
        int diff = (arr[n-1]-arr[0])/n;
        for(int i=0;i<n;i++)
        {
            if(arr[i]+diff != arr[i+1])
            {
                return arr[i]+diff;
            }
        }
        return 0;
    }
}
