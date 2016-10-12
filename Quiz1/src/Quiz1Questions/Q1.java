package Quiz1Questions;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Q1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("How many touchdowns did the QB throw?");
		double TD = s.nextDouble();

		System.out.println("How many total yards did the QB gain?");
		double YDS = s.nextDouble();
		
		System.out.println("How many INTs did the QB throw?");
		double INT = s.nextDouble();
		
		System.out.println("How many passes did the QB complete?");
		double COMP = s.nextDouble();
		
		System.out.println("How many passes did the QB attempt?");
		double ATT = s.nextDouble();
		
		double a = ((COMP/ATT)-0.3)*5;
		double b = ((YDS/ATT)-3)*.25;
		double c = (TD/ATT)*20;
		double d = 2.375-((INT/ATT)*25);
		
		// QBR indicates quarterback rating which is the same as passer rating 
		double QBR = ((a+b+c+d)/6)*100;
		
		DecimalFormat rating = new DecimalFormat("000.0");
		System.out.println("This is the QB's passer rating: " + rating.format(QBR));
		s.close();
	
	}
}
