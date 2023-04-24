You are given an array A of size N. You need to print elements of A in alternate order (starting from index 0).
Input:
N = 4
A[] = {1, 2, 3, 4}
Output:
1 3
  
import java.util.*;
import java.io.*;

class Main {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            GFG gfg = new GFG();
            gfg.print(arr,n);
            System.out.println();
        }
    }
}
class GFG {
    public static void print(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            if(i%2 == 0)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
