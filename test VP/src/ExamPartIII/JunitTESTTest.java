package ExamPartIII;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTESTTest {

	@Test
	void calculateNetTest() {
		JunitTEST junit = new JunitTEST ();
		double netSalary = junit.calculateNet(4.5, 20, 5);
		assertEquals(84.5,netSalary);
	} // end calculateNetTest

}// end class JunitTESTTest
