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
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    
		    if(x!=a && x!=b && y!=a && y!=b){
		        System.out.println("2");
		    }
		    else if((x==a || x==b) && (y==a || y==b)){
		        System.out.println("0");
		    }
		    else{
		        System.out.println("1");
		    }
		}
	}
}
