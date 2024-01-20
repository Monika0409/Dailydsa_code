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
		    int n = sc.nextInt();
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    
		    int round = 0;
		    while(n>1){
		        n /= 2;
		        round++;
		    }
		    if(round == 0){
		        System.out.println("0");
		    }
		    else{
		        System.out.println(a*round + (round-1)*b);
		    }
		}
	}
}
