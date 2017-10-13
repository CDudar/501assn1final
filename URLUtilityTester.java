package assignment1;

import static org.junit.Assert.*;


import org.junit.Test;


public class URLUtilityTester {
	
	@Test
	public void testURLs() {
		
			URLUtilityClass urlUtility = new URLUtilityClass("people.ucalgary.ca/~mghaderi/index.html");
		
			assertEquals("people.ucalgary.ca", urlUtility.getHostName() );
			assertEquals("/~mghaderi/index.html", urlUtility.getPathName() );
			assertEquals(80, urlUtility.getPortNumber());
			
			
			urlUtility = new URLUtilityClass("people.ucalgary.ca/~mghaderi/test/uc.gif");
			
			assertEquals("people.ucalgary.ca", urlUtility.getHostName() );
			assertEquals("/~mghaderi/test/uc.gif", urlUtility.getPathName() );
			assertEquals(80, urlUtility.getPortNumber());
			
			
			urlUtility = new URLUtilityClass("people.ucalgary.ca/~mghaderi/test/a.pdf");
			
			assertEquals("people.ucalgary.ca", urlUtility.getHostName() );
			assertEquals("/~mghaderi/test/a.pdf", urlUtility.getPathName() );
			assertEquals(80, urlUtility.getPortNumber());
			
			
			urlUtility = new URLUtilityClass("people.ucalgary.ca:79/~mghaderi/test/test.html");
			
			assertEquals("people.ucalgary.ca", urlUtility.getHostName() );
			assertEquals("/~mghaderi/test/test.html", urlUtility.getPathName() );
			assertEquals(79, urlUtility.getPortNumber());
		
			

		
	}

}
