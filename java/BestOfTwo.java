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
		    int a1 = sc.nextInt();
		    int a2 = sc.nextInt();
		    int a3 = sc.nextInt();
		    int b1 = sc.nextInt();
		    int b2 = sc.nextInt();
		    int b3 = sc.nextInt();
		    
		    int x = 0;
		    int y = 0;
		    
		    if(a1<=a2 && a1<=a3){
		        x = a2+a3;
		    }
		    else if(a2<=a1 && a2<=a3){
		        x = a1+a3;
		    }
		    else{
		        x = a1+a2;
		    }
		    
		    if(b1<=b2 && b1<=b3){
		        y = b2+b3;
		    }
		    else if(b2<=b1 && b2<=b3){
		        y = b1+b3;
		    }
		    else{
		        y = b1+b2;
		    }
		    
		    if(x<y){
		        System.out.println("Bob");
		    }
		    else if(x>y){
		        System.out.println("Alice");
		    }
		    else{
		        System.out.println("Tie");
		    }
		}
	}
}
