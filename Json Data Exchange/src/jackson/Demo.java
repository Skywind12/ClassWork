package jackson;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		String inline = "";
		try {
			URL url = new URL(
					"https://api.data.gov/ed/collegescorecard/v1/schools.json?api_key=9aJoiUII8SHpRQNJcY3xP2Qedufl3C13j3U66hPj&school.degrees_awarded.highest=2,3&_fields=id,school.name,2013.student.size,school.school_url&_per_page=100&_page=1");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			
			int responseCode= conn.getResponseCode();
			if(responseCode != 200) {
				throw new RuntimeException("HttpResponseCode: " + responseCode);
			}
			else {
				Scanner sc = new Scanner(url.openStream());
				while(sc.hasNext())
				{
					inline += sc.nextLine();
				}
				System.out.println(inline);
				sc.close();
			}
			//continue here
		//	ObjectMapper objectMapper = new ObjectMapper();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
