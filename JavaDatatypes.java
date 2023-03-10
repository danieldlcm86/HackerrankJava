package hackerRank;

import java.util.Scanner;

public class JavaDatatypes {

	public static void main(String[] args) {
		// byte -128 a 127
		// short -32768 a 32767
		// int -2147483648 a 2147483647
		// long -9223372036854775808 a 9223372036854775807

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long n=sc.nextLong();
                System.out.println(n+" can be fitted in:");

                if(n>=-128 && n<=127)System.out.println("* byte");
                if(n>=-32768 && n<= 32767)System.out.println("* short");
                if(n>=-2147483648 && n<=2147483647)System.out.println("* int");
                if(n>=-9223372036854775808L && n<=9223372036854775807L)System.out.println("* long");
                sc.close();

                
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}

