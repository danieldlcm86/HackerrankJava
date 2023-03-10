package hackerRank;

import java.util.Scanner;

public class JavaStrings {

	public static void main(String[] args) {
		System.out.println("Escribe una palabra");
        
        Scanner scanner = new Scanner(System.in);
        String stringA = scanner.next();
        
        System.out.println("Escribe otra palabra");
        String stringB = scanner.next();
        
        	scanner.close();
        
        int output1 = stringA.length() + stringB.length();
        System.out.println(output1);
        
        System.out.println(stringA.compareTo(stringB) > 0 ? "Yes" : "No");
        
        String StringA = stringA.substring(0,1).toUpperCase() + stringA.substring(1).toLowerCase();
        String StringB = stringB.substring(0,1).toUpperCase() + stringB.substring(1).toLowerCase();
        
        System.out.println(StringA + " " + StringB);
         
	}

}
