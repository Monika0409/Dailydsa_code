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
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    if(a*y > b*x){
		        System.out.println("Chefina");
		    }else if(a*y < b*x){
		        System.out.println("Chef");
		    }
		    else{
		        System.out.println("Both");
		    }
		}
	}
}
