package epamcom.exceptionHandling;

import java.util.Scanner;
import java.util.logging.Logger;

public class CalculationOfInterest {
	static Logger l = Logger.getLogger(CalculationOfInterest.class.getName());
	public static void CalculateInterest(){
		Scanner s=new Scanner(System.in);
		try {
			l.info("Enter Principal:");
			double p=s.nextDouble();
			l.info("Enter Time:");
			double t=s.nextDouble();
			l.info("Enter Rate:");
			double r=s.nextDouble();
			l.info("Calculated Simple Interest(SI) :" + (p*t*r)/100);
			l.info("Calculated Compound Interest(CI) :"+ p*(Math.pow((1+r/100),t)));
		}
		catch (Exception e) {
			l.info("INVALID INPUT");
		}
	}
}


