package jeninsdemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest1 {

	@Test
	public void tc1()
	{
		Reporter.log("Helo java", true);
	}
}
