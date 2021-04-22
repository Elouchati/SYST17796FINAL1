package ExamPartIII;

public class JunitTEST {

	public double calculateNet(double hours , double rate,double tax) {
		double net,gross; 
		
		gross = hours * rate;
		net = gross - tax;
		
		return net;
	}
}// end class JunitTEST
