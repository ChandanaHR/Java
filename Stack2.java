Let's give it a try! You have a linked list and you have to implement the functionalities push and pop of stack using this given linked list. Your task is to use the class as shown in the comments in the code editor and complete the functions push() and pop() to implement a stack. 

Example 1:

Input: 
push(2)
push(3)
pop()
push(4) 
pop()
Output: 3 4
Explanation: 
push(2)    the stack will be {2}
push(3)    the stack will be {2 3}
pop()      poped element will be 3,
           the stack will be {2}
push(4)    the stack will be {2 4}
pop()      poped element will be 4
Example 2:

Input: 
pop()
push(4)
push(5)
pop()
Output: -1 5

import java.io.*;
import java.util.*;

class StackNode {
    int data;
    StackNode next;
    StackNode(int a)
    {
        data = a;
        next = null;
    }
}

public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            MyStack obj = new MyStack();
            int Q = sc.nextInt();
            while(Q>0)
            {
                int QueryType = 0;
                QueryType = sc.nextInt();
                if(QueryType==1)
                {
                    int a = sc.nextInt();
                    obj.push(a);
                }
                else if(QueryType==2)
                {
                    System.out.println(obj.pop()+" ");
                }
                Q--;
            }
            System.out.println("");
            t--;
        }
    }
}

class MyStack {
    StackNode top;
    
    void push(int a)
    {
        StackNode node = new StackNode(a);
        node.next = top;
        top = node;
    }
    int pop()
    {
        if(top==null)
        {
            return -1;
        }
        int x = top.data;
        top=top.next;
        return x;
    }
}
