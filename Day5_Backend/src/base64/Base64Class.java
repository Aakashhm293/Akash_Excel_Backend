package base64;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64Class {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String name = "Akash";
		
		
		String encodedText = Base64.getEncoder().encodeToString(name.getBytes("UTF-8"));
		System.out.println(encodedText);
		
		byte[] decodedArr = Base64.getDecoder().decode(encodedText);
		String decodedText = new String(decodedArr, "UTF-8");
		System.out.println(decodedText);
	}
	
}
