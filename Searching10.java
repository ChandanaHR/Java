Given two lists V1 and V2 of sizes n and m respectively. Return the list of elements common to both the lists and return the list in sorted order. Duplicates may be there in the output list.

Example:

Input:
n = 5
v1[] = {3, 4, 2, 2, 4}
m = 4
v2[] = {3, 2, 2, 7}
Output:
2 2 3
Explanation:
The common elements in sorted order are {2 2 3}

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            int v1[] = new int[n];
            for(int i=0;i<n;i++)
            {
                v1[i] = sc.nextInt();
            }
            int m = sc.nextInt();
            int v2[] = new int[m];
            for(int i=0;i<m;i++)
            {
                v2[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.sorted(v1,v2);
            for(int i:ans)
            {
                System.out.print(i+" ");
            }
            System.out.println();
            t--;
        }
    }
}

class Solution {
    public static ArrayList<Integer> sorted(int v1[],int v2[])
    {
        Arrays.sort(v1);
        Arrays.sort(v2);
        int i=0,j=0;
        ArrayList<Integer> example = new ArrayList<Integer>();
        while(i<v1.length && j<v2.length)
        {
            if(v1[i]<v2[j])
            {
                i++;
            }
            else if(v1[i]>v2[j])
            {
                j++;
            }
            else 
            {
                example.add(v1[i]);
                i++;
                j++;
            }
        }
        return example;
    }
}
