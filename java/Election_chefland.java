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
		    int Xa = sc.nextInt();
		    int Xb = sc.nextInt();
		    int Xc = sc.nextInt();
		    
		    if(Xa > 50){
		        System.out.println("A");
		    }
		    else if(Xb > 50){
		        System.out.println("B");
		    }
		    else if(Xc > 50){
		        System.out.println("C");
		    }
		    else{
		        System.out.println("Nota");
		    }
		}
	}
}
