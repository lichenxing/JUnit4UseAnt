package com.telek.calculateTest;

import static org.junit.Assert.assertEquals;

/*import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;*/
import org.junit.Test;

//import com.telek.calculate.Calculate;

public class CalculateTest {

	@Test
	public void testAdd() {

		assertEquals(9, 4, 5);
		/*Log logger = LogFactory.getLog(CalculateTest.class);
		logger.debug(Calculate.add(4, 5));*/

	}

	@Test
	public void testDes() {
		assertEquals(6, 9, 3);
		/*Log logger = LogFactory.getLog(CalculateTest.class);
		logger.debug(Calculate.des(9, 3));*/

	}

	@Test
	public void testMul() {
		assertEquals(0, 0, 2);
	/*	Log logger = LogFactory.getLog(CalculateTest.class);
		logger.debug(Calculate.mul(0, 2));*/

	}
	

}
