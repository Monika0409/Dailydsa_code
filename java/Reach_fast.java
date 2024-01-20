import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int k = sc.nextInt();
		    int a = x-y;
		    int b = y-x;
		    if(x>=y && a%k!=0){
		        System.out.println(a/k + 1);
		    }
		    else if(x<y && b%k!=0){
		        System.out.println(b/k + 1);
		    }
		    else if(x<y && b%k==0){
		        System.out.println(b/k);
		    }
		    else{
		        System.out.println(a/k);
		    }
		}
	}
}
