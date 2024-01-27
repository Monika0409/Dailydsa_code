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
		    String s1 = sc.next();
		    String s2 = sc.next();
		    char ch1[] = s1.toCharArray();
		    char ch2[] = s2.toCharArray();
		    
		    int max_count = 0;
		    int min_count = 0;
		    
		    for(int j=0; j<s1.length(); j++){
		        if(ch1[j]=='?' || ch2[j]=='?'){
		            max_count++;
		        }
		        else if(ch1[j] != ch2[j]){
		            max_count++;
		            min_count++;
		        }
		    }
		    System.out.println(min_count + " " + max_count);
		}
	}
}
