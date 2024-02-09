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
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int a[] = new int[n];

            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            int count = 0;
            int inversionIndex = -1;
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    count++;
                    inversionIndex = j;
                    if (count > 1) {
                        break;
                    }
                }
            }
            
            if (count == 0) {
                System.out.println("YES");
            } else if (count == 1) {
                // Check if swapping the inverted pair makes the array sorted
                int temp = a[inversionIndex];
                a[inversionIndex] = a[inversionIndex + 1];
                a[inversionIndex + 1] = temp;
                
                boolean sorted = true;
                for (int j = 0; j < n - 1; j++) {
                    if (a[j] > a[j + 1]) {
                        sorted = false;
                        break;
                    }
                }
                
                if (sorted) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}