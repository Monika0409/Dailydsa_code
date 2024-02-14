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
		    int m = findSmallestWithDifferentParity(n);
		    System.out.println(m);
		}
	}
	
    public static int digitSum(int number) {
        int totalSum = 0;
        while (number > 0) {
            totalSum += number % 10;
            number /= 10;
        }
        return totalSum;
    }

    public static int findSmallestWithDifferentParity(int N) {
        int digitSumN = digitSum(N);
     
        boolean isNodd = digitSumN % 2 != 0;

        for (int i = N + 1; ; i++) {
            int digitSumX = digitSum(i);
            boolean isXodd = digitSumX % 2 != 0;
            if (isNodd != isXodd) {
                return i;
            }
        }
    }
}
