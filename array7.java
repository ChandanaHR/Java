Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader. 
Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17 
as it is greater than all the elements
to its right.  Similarly, the next 
leader is 5. The right most element 
is always a leader so it is also 
included.
  
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String [] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter ot = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0;i<n;i++)
            {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution obj = new Solution();
            StringBuffer str = new StringBuffer();
            ArrayList<Integer> res = new ArrayList<Integer>();
            res = obj.leaders(arr,n);
            for(int i=0;i<res.size();i++)
            {
                ot.print(res.get(i)+" ");
            }
            ot.println();
        }
        ot.close();
    }
}

class Solution {
    static ArrayList<Integer> leaders(int arr[],int n)
    {
        ArrayList<Integer> output = new ArrayList<Integer>();
        output.add(arr[n-1]);
        int maxele = arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>=maxele)
            {
                maxele = arr[i];
                output.add(maxele);
            }
        }
        Collections.reverse(output);
        return output;
    }
}
