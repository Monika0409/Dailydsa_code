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
		    
		    int limak = 0; 
		    int bob = 0;
		    int c=1;
		    String winner;
		    while(true){
		        if(c%2==1){
		            limak += c;
		            if(limak > a){
		                winner = "Bob";
		                break;
		            }
		        }
		        else{
		            bob += c;
		            if(bob > b){
		                winner = "Limak";
		                break;
		            }
		        }
		        c += 1;
		    }
		    System.out.println(winner);
		}
	}
}
