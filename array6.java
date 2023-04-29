Given an unsorted array of positive integers, find the number of triangles that can be formed with three different array elements as three sides of triangles. For a triangle to be possible from 3 values, the sum of any of the two values (or sides) must be greater than the third value (or third side). 
Input: arr= {4, 6, 3, 7}
Output: 3
Trace : {4 6 3}-> 4+6>3 6+3>4 4+3>6
{4 6 7}-> 4+6>7 6+7>4 4+7>6
{6 3 7}-> 6+3>7 3+7>6 6+7>3
{4 3 7} cannot be considered

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            System.out.println(ob.countnotriangles(arr,n));
            t--;
        }
    }
}

class Solution {
    public static int countnotriangles(int arr[],int n)
    {
        Arrays.sort(arr);
        int i,j,k,count=0;
        for(i=0;i<n-2;i++)
        {
            for(j=i+1;j<n-1;j++)
            {
                for(k=j+1;k<n;k++)
                {
                    if(arr[i]+arr[j]<=arr[k])
                    {
                        break;
                    }
                    count++;
                }
            }
        }
        return count;
    }
}
