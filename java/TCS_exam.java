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
		    int d1 = sc.nextInt();
		    int d2 = sc.nextInt();
		    int d3 = sc.nextInt();
		    
		    int s1 = sc.nextInt();
		    int s2 = sc.nextInt();
		    int s3 = sc.nextInt();
		    
		    int d4 = d1+d2+d3;
		    int s4 = s1+s2+s3;
		    
		    if(d4>s4){
		        System.out.println("Dragon");
		    }
		    else if(d4<s4){
		        System.out.println("Sloth");
		    }
		    else if(d1>s1){
		        System.out.println("Dragon");
		    }
		    else if(d1<s1){
		        System.out.println("Sloth");
		    }
		    else if(d2>s2){
		        System.out.println("Dragon");
		    }
		    else if(d2<s2){
		        System.out.println("Sloth");
		    }
		    else{
		        System.out.println("Tie");
		    }
		}
	}
}
