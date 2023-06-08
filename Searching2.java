Given an array H representing heights of buildings. You have to count the buildings which will see the sunrise (Assume : Sun rise on the side of array starting point).
Note : Height of building should be strictly greater than height of buildings in left in order to see the sun.


Example 1:

Input: 
N = 5
H[] = {7, 4, 8, 2, 9}
Output: 3
Explanation: As 7 is the first element, it
can see the sunrise. 4 can't see the
sunrise as 7 is hiding it.  8 can see.
2 can't see the sunrise. 9 also can see
the sunrise.
Example 2:

Input: 
N = 4
H[] = {2, 3, 4, 5}
Output: 4
Explanation: As 2 is the first element, it
can see the sunrise.  3 can see the
sunrise as 2 is not hiding it. Same for 4
and 5, they also can see the sunrise.
  
  
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t>0)
        {
            int n = Integer.parseInt(br.readLine());
            String[] str = br.readLine().trim().split(" ");
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = Integer.parseInt(str[i]);
            }
            int ans = new Solution().facing(arr,n);
            System.out.println(ans);
            t--;
        }
    }
}

class Solution {
    public int facing(int arr[],int n)
    {
        int sun = arr[0];
        int count = 1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>sun)
            {
                sun = arr[i];
                count++;
            }
        }
        return count;
    }
}
