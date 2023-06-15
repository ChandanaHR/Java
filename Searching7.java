Vaibhav likes to play with numbers and he has N numbers. One day he was placing the numbers on the playing board just to count that how many numbers he has. He was placing the numbers in increasing order i.e. from 1 to N. But when he was putting the numbers back into his bag, some numbers fell down onto the floor. He picked up all the numbers but one number, he couldn't find. Now he has to go somewhere urgently, so he asks you to find the missing number.
NOTE: Don't use Sorting


Example 1:

Input:                                                       
N = 4                                        
A[] = {1, 4, 3}
Output:
2     
Explanation:
Vaibhav placed 4 integers but he picked
up only 3 numbers. So missing number
will be 2 as it will become 1,2,3,4.
 

Example 2:

Input:                        
N = 5
A[] = {2, 5, 3, 1}
Output:
4
Explanation:
Vaibhav placed 5 integers on the board,
but picked up only 4 integers, so the
missing number will be 4 so that it
will become 1,2,3,4,5.
  
  
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n+5];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0;i<n-1;i++)
            {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            Compute obj = new Compute();
            System.out.println(obj.missingnumber(n,a));
            t--;
        }
    }
}

class Compute {
    public static int missingnumber(int N,int A[])
    {
        int freq[] = new int[N+5];
        Arrays.fill(freq,-1);
        int flag=-1;
        for(int i=0;i<N-1;i++)
        {
            freq[A[i]] = 0;
        }
        for(int i=1;i<N+5;i++)
        {
            if(freq[i]==-1)
            {
                flag = i;
                break;
            }
        }
        return flag;
    }
}
