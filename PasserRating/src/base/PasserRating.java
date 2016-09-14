package base;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PasserRating {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("How many touchdowns this game?");
		double TD = s.nextDouble();

		System.out.println("How many total yards this game?");
		double Yards = s.nextDouble();

		System.out.println("How many interceptions this game?");
		double INT = s.nextDouble();

		System.out.println("How many completions this game?");
		double comp = s.nextDouble();

		System.out.println("How many number of passes attempted this game?");
		double ATT = s.nextDouble();
		s.close();

		double aa = ((comp / ATT) - .3) * 5;
		double bb = ((Yards / ATT) - 3) * .25;
		double cc = (TD / ATT) * 20;
		double dd = 2.375 - ((INT / ATT) * 25);
		double PR = ((aa + bb + cc + dd) / 6) * 100;

		DecimalFormat QBrating = new DecimalFormat("0.00");

		System.out.println("Total Quarterback Rating: " + QBrating.format(PR));
	}

}
