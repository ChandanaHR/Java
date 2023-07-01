Reverse a string using Stack
You are given a string S, the task is to reverse the string using stack.

 

Example 1:


Input: S="GeeksforGeeks"
Output: skeeGrofskeeG

//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            System.out.println(obj.reverse(sc.next()));
        }
	}
}

// } Driver Code Ends


class Solution {
    
    public String reverse(String S){
        //code here
        String res = "";
        Stack<Character> stack = new Stack<Character>();
        for(char c: S.toCharArray())
        {
            stack.push(c);
        }
        for(int i=0;i<S.length();i++)
        {
            res+=stack.pop();
        }
        return res;
    }

}
