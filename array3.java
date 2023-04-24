Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.
Input:
N = 6
A[] = {3, 2, 1, 56, 10000, 167}
Output:
min = 1, max =  10000
  
import java.util.*;
import java.io.*;

class pair {
    long first, second;
    public pair(long first,long second) //Constructor: accessmodifier classname(arguments)
    {
        this.first = first;
        this.second = second;
    }
}

class Main {
    public static void main(String [] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long arr[] = new long[(int)(n)];
            String inputline[] = br.readLine().trim().split(" ");
            for(int i=0;i<n;i++)
            {
                arr[i] = Long.parseLong(inputline[i]);
            }
            Compute obj = new Compute();
            pair product = obj.getminmax(arr,n);
            System.out.println(product.first+" "+product.second);
        }
    }
}

class Compute{
    static pair getminmax(long arr[],long n)
    {
        long min = arr[0],max = arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return new pair(min,max);
    }
}
