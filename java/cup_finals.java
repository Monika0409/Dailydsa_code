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
		    int d = sc.nextInt();
		    
		    if(x>=y && x-y<=d || x<y && y-x<=d){
		        System.out.println("yes");
		    }
		    else{
		        System.out.println("no");
		    }
		    
		}
	}
}
