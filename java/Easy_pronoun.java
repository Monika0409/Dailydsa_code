import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next(); 
            char ch[] = s.toCharArray();

            int count = 0;
            boolean is = true;

            for (int j = 0; j < s.length(); j++) {
                if (ch[j] != 'a' && ch[j] != 'e' && ch[j] != 'i' && ch[j] != 'o' && ch[j] != 'u') {
                    count++;
                    if (count >= 4) {
                        is = false;
                        break; 
                    }
                } else {
                    count = 0; 
                }
            }

            if (is) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}