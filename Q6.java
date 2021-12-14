package Day4;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
        System.out.print("Input the side length value: ");
        double val = in.nextDouble();

        double Square =val*val;
        double Cube =val*val*val;
        double Fourth_power =Math.pow(val, 4);
        System.out.printf("Square: " +Square);
        System.out.printf("Cube : " +Cube);
        System.out.printf("Fourth power: " +Fourth_power);
	}

}
