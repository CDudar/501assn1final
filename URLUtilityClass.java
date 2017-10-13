package assignment1;

public class URLUtilityClass {

	private String hostName;
	private String pathName;
	private int portNumber;

	public URLUtilityClass(String url) {
		this.hostName = parseHostName(url);
		this.pathName = parsePathName(url);
		this.portNumber = parsePortNumber(url);
	}
	
	public String parseHostName(String url){
		String hostName = url.substring(0, url.indexOf("/"));
		
		//check if URL has portNumber
		if(url.indexOf(":") != -1) {
			hostName = url.substring(0, url.indexOf(":"));
		}

		return hostName;
	}
	
	public String parsePathName(String url) {
		
		String pathName = url.substring(url.indexOf("/"));
		return pathName;
	}
	
	public int parsePortNumber(String url) {
		
		int portNumber = 80;
		
		//check if URL has portumber
		if(url.indexOf(":") != -1) {
			portNumber = Integer.parseInt(url.substring(url.indexOf(":") + 1, url.indexOf("/")));	
		}
		
		return portNumber;
		
	}
	
	public String getPathName() {
		return pathName;
		
	}
	
	public String getHostName() {
		return hostName;
	}
	
	public int getPortNumber() {
		return portNumber;
	}
	
	
	
	
	
	
}
