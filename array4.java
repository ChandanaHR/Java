Given an unsorted array arr[] of size N. Rotate the array to the left (counter-clockwise direction) by D steps, where D is a positive integer. 
Input:
N = 5, D = 2
arr[] = {1,2,3,4,5}
Output: 3 4 5 1 2
Explanation: 1 2 3 4 5  when rotated
by 2 elements, it becomes 3 4 5 1 2.
  
import java.io.*;
import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++)
        {
            String str = br.readLine();
            String starr[] = str.split(" ");
            int n = Integer.parseInt(starr[0]);
            int d = Integer.parseInt(starr[1]);
            int arr[] = new int[n];
            String str1 = br.readLine();
            String starr1[] = str1.split(" ");
            for(int j=0;j<n;j++)
            {
                arr[j] = Integer.parseInt(starr1[j]);
            }
            new Solution().rotatearray(arr,d,n);
            StringBuffer sb = new StringBuffer();
            for(int t1=0;t1<n;t1++)
            {
                sb.append(arr[t1]+" ");
            }
            out.println(sb);
        }
        out.close();
    }
}

class Solution
{
    static void reverse(int arr[],int start,int end)
    {
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void rotatearray(int arr[],int d,int n)
    {
        d = d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
}
