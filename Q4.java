package Day4;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Input an integer between 0 and 1000: ");
        int num = input.nextInt();

        int f = num % 10;
        int remainingNumber = num / 10;
        
        int s = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        
        int t = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        
        int fo = remainingNumber % 10;
        
        int sum = t + s + f + fo;
        System.out.println("The sum of all digits in " + num + " is " + sum);

	}

}
