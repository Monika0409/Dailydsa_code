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
		    int c = sc.nextInt();
		    int d = sc.nextInt();
		    int e = sc.nextInt();
		    int x = a+b;
		    int y = a+c;
		    int z = b+c;
		    if((x<=d && c<=e)){
		        System.out.println("Yes");
		    }
		    else if(y<=d && b<=e){
		        System.out.println("Yes");
		    }
		    else if(z<=d && a<=e){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
	}
}
