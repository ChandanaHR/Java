Design a data-structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and an additional operation getMin() which should return minimum element from the SpecialStack. Your task is to complete all the functions, using stack data-Structure.


Example 1:

Input:
Stack: 18 19 29 15 16
Output: 15
Explanation:
The minimum element of the stack is 15.

//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SpeStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Stack<Integer> s=new Stack<>();
			GfG g=new GfG();
			while(!g.isEmpty(s)){
			    g.pop(s);
			}
			while(!g.isFull(s,n)){
				g.push(sc.nextInt(),s);
			}
		System.out.println(g.min(s));
		}
	}
}
// } Driver Code Ends


/*Complete the function(s) below*/
class GfG{
	public void push(int a,Stack<Integer> s)
	{
	    //add code here.
	    s.push(a);
	}
	public int pop(Stack<Integer> s)
        {
            //add code here.
            int b = s.pop();
            return b;
	}
	public int min(Stack<Integer> s)
        {
           //add code here.
           int min = Integer.MAX_VALUE;
            while(!s.isEmpty())
            {
                int temp = s.pop();
                if(temp<min)
                {
                    min = temp;
                }
            }
            return min;
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           //add code here.
           return n==s.size();
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           //add code here.
           return s.size()==0;
	}
}
