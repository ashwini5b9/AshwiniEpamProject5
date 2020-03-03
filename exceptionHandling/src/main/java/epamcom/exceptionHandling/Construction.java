package epamcom.exceptionHandling;

import java.util.Scanner;
import java.util.logging.Logger;

public class Construction {
	static Logger l = Logger.getLogger(Construction.class.getName());
	public static void CalculationOfCost() {
		Scanner s = new Scanner(System.in);
		l.info("Select among the following levels(Standards)");
		l.info("1. Normal");
		l.info("2. Medium");
		l.info("3. High");
		l.info("4. High and fully automated");
		try {
			int ch = s.nextInt();
			l.info("ENTER AREA OF THE HOUSE");
			switch(ch){
				case 1:
				l.info("Result Price = Rs."+s.nextDouble() * 2000);
				break;
				case 2:
				l.info("Result Price = Rs."+s.nextDouble() * 4000);
				break;
				case 3:
				l.info("Result Price = Rs."+s.nextDouble() * 8000);
				break;
				case 4:
				l.info("Result Price = Rs."+s.nextDouble() * 10000);
				break;
				default:
				l.info("INVALID INPUT");
			}
		} catch (Exception e) {
			l.info("INVALID INPUT");
		}
	}
}