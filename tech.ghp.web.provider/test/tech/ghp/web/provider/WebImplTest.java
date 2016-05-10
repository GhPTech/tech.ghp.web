package tech.ghp.web.provider;

import junit.framework.TestCase;

/*
 * 
 * 
 * 
 */

public class WebImplTest extends TestCase {
	
	/*
	 * 
	 * 
	 * 
	 */
	public void testSimple() throws Exception {
			WebImpl testString = new WebImpl();
			String expectedString = new String("GHP");
			String inputString = new String(testString.upper("ghp"));
			assertEquals(expectedString,inputString);
	}
}
