package test;

import java.net.HttpURLConnection;
import java.net.URL;

public class SupportedHTTPMethod {

	public static void main(String[] args) {
		try {
			String urlFormat = "http://localhost:8080/HttpMethods/TestServlet%s";
			for (int i = 1; i < 4; i++) {
				String testUrl = String.format(urlFormat, i);
				System.out.println(testUrl);
				URL url = new URL(testUrl);
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				connection.setRequestMethod("OPTIONS");
				System.out.println("TestServlet" + i + ", Allow: " + connection.getHeaderField("Allow"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
