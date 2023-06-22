//INSERTION SORT
The task is to complete the insert() function which is used to implement Insertion Sort.


Example 1:

Input:
N = 5
arr[] = { 4, 1, 3, 9, 7}
Output:
1 3 4 7 9
Example 2:

Input:
N = 10
arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
Output:
1 2 3 4 5 6 7 8 9 10
  
import java.io.*;
import java.util.*;

public class Main {
    static void printarray(int arr[],int size)
    {
        int i;
        for(i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String [] args)
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
            new Solution().insertionsort(arr,n);
            printarray(arr,n);
            t--;
        }
    }
}

class Solution {
    static void insert(int arr[],int i)
    {
        while(i>0 && arr[i]<arr[i-1])
        {
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
            i--;
        }
    }
    public static void insertionsort(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            int j = i;
            insert(arr,j);
        }
    }
}
