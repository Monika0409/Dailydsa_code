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
		   
		    int a1 = 500 - (x*2);
		    int b1 = 1000 - ((y+x)*4);
		    int a2 = 500 - ((x+y)*2);
		    int b2 = 1000 - (y*4);
		    
		    if(a1+b1 >= a2+b2){
		        System.out.println(a1+b1);
		    }
		    else{
		        System.out.println(a2+b2);
		    }
		}
	}
}
