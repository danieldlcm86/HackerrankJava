package hackerRank;

import java.util.Scanner;

public class JavaIntToString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		String s= Integer.toString(n);

		
			if (n == Integer.parseInt(s)) {
				System.out.println("Good job");
			} else {
				System.out.println("Wrong answer.");
			}
			
		//System.out.println(((Object)n).getClass().getSimpleName()); Para conocer el tipo de dato
			//en consola muestra Integer
		//System.out.println(((Object)s).getClass().getSimpleName());
			// en consola muestra String
		
		scanner.close();
		
		
	}

}
