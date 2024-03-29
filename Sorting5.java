//MERGE SORT ALGORITHM
Given an array arr[], its starting position l and its ending position r. Sort the array using merge sort algorithm.
Example 1:

Input:
N = 5
arr[] = {4 1 3 9 7}
Output:
1 3 4 7 9
Example 2:

Input:
N = 10
arr[] = {10 9 8 7 6 5 4 3 2 1}
Output:
1 2 3 4 5 6 7 8 9 10


//{ Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}



// } Driver Code Ends


class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         int mergearr[] = new int[r-l+1];
         int idx1=l,idx2=m+1,x=0;
         while(idx1<=m && idx2<=r)
         {
             if(arr[idx1]<=arr[idx2])
             {
                 mergearr[x++] = arr[idx1++];
             }
             else
             {
                 mergearr[x++] = arr[idx2++];
             }
         }
         while(idx1<=m)
         {
             mergearr[x++] = arr[idx1++];
         }
         while(idx2<=r)
         {
             mergearr[x++] = arr[idx2++];
         }
         for(int i=0,j=l;i<mergearr.length;i++,j++)
         {
             arr[j] = mergearr[i];
         }
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(l>=r)
        {
            return;
        }
        int m = l+(r-l)/2;
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        merge(arr,l,m,r);
    }
}
