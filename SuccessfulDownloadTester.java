package assignment1;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class SuccessfulDownloadTester {

	@Test
	public void test() {
		String[] url = {
				"people.ucalgary.ca/~mghaderi/index.html",
				"people.ucalgary.ca/~mghaderi/test/uc.gif",
				"people.ucalgary.ca/~mghaderi/test/a.pdf",
				"people.ucalgary.ca:80/~mghaderi/test/test.html"
		};

		int bytesDownloaded;
		
		try {
			UrlCache cache = new UrlCache(true);
			
			
			bytesDownloaded = cache.getObject("people.ucalgary.ca/~mghaderi/index.html");
			assertEquals(5974 , bytesDownloaded);
			
			bytesDownloaded = cache.getObject("people.ucalgary.ca/~mghaderi/test/uc.gif");
			assertEquals(3090, bytesDownloaded);
			
			bytesDownloaded = cache.getObject("people.ucalgary.ca/~mghaderi/test/a.pdf");
			assertEquals(479301, bytesDownloaded);
			
			bytesDownloaded = cache.getObject("people.ucalgary.ca:80/~mghaderi/test/test.html");
			assertEquals(35, bytesDownloaded);
			
		}
		catch (IOException e) {
			System.out.println("There was a problem: " + e.getMessage());
		}

	}
}
