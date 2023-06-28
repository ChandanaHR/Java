Given an array of n distinct elements. Find the minimum number of swaps required to sort the array in strictly increasing order.


Example 1:

Input:
nums = {2, 8, 5, 4}
Output:
1
Explaination:
swap 8 with 4.
Example 2:

Input:
nums = {10, 19, 6, 3, 5}
Output:
2
Explaination:
swap 10 with 3 and swap 19 with 5.

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minSwaps(nums);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends




class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        // Code here
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int count=0;
        int n = nums.length;
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = nums[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            map.put(arr[i],i);
        }
        int i=0;
        while(i<n)
        {
            if(map.get(nums[i])==i)
            {
                i++;
            }
            else
            {
                int temp = nums[map.get(nums[i])];
                nums[map.get(nums[i])] = nums[i];
                nums[i] = temp;
                count++;
            }
        }
        return count;
    }
}
