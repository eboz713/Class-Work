package whatShouldIWear;

import java.util.Scanner;

public class whatShouldIWear {
	
	public static String switchTest(int x) {
		String result;
		switch (x) {
		case 1:
			result = "you should wear a coat";
			break;
		case 2:
			result = "you should wear a t-shirt";
		default:
			result = "unexpected input";
			break;
			
		}
		return result;
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Value is:");
		int x = scan.nextInt();
		switchTest(x);
		System.out.println(switchTest(x));
		
	}
	
}
