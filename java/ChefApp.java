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
		    int s = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		    
		    
		    if(s-x-y >= z){
		        System.out.println("0");
		    }
		    else if(s - Math.min(x,y) >= z){
		        System.out.println("1");
		    }
		    else{
		        System.out.println("2");
		    }
		}
	}
}
