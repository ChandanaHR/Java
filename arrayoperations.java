import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] a = new int[10000];
            Arrays.fill(a,-1);
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextInt();
            }
            int x = sc.nextInt();
            int y = sc.nextInt();
            int yi = sc.nextInt();
            int z = sc.nextInt();
            GFG g = new GFG();
            boolean b = g.searchele(a,x);
            if(b==true)
            {
                System.out.print("1 ");
            }
            else
            {
                System.out.print("0 ");
            }
            b = g.insert(a,y,yi);
            if(b)
            {
                if(a[yi]==y)
                {
                    System.out.print("1 ");
                }
                else
                {
                    System.out.print("0 ");
                }
            }
            else
            {
                System.out.print("0 ");
            }
            b = g.deleteele(a,z);
            if(b)
            {
                if(!g.searchele(a,z))
                {
                    System.out.print("1 ");
                }
                else
                {
                    System.out.print("0 ");
                }
            }
            else
            {
                System.out.print("0 ");
            }
        }
    }
}


/*Complete the function(s) below*/
class GfG
{		
	public boolean searchEle(int a[],int x)
       {
		//add code here.
		for(int i=0;i<a.length;i++)
        {
            if(a[i]==x)
            {
                return true;
            }
        }
        return false;
	}
	public boolean insertEle(int a[],int y,int yi)
        {
              //add code here.
              if(yi<a.length)
              {
                    a[yi] = y;
                    return true;
               }
        return false;
	}
	public boolean deleteEle(int a[],int z)
        {
		//add code here.
		return true;
	}
}
