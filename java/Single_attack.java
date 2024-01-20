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
		    int h = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int a = h-y;
		    int b = a/x;
		    if(h==y){
		        System.out.println("1");
		    }
		    else if(x<y && a%x==0){
		        System.out.println(b+1);
		    }
		    else{
		        System.out.println(b + 2);
		    }
		    
		}
	}
}
