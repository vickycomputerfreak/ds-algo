package org.learnbay.url_shortening;

public class UrlShorterner {
	/*
	 * generate a shorten URL from an integer Id
	*/
	
	static String idToShortURL(int num) {
		char map[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
		StringBuffer shortUrl = new StringBuffer();
		/*
		 * convert to base 62 given that 26 letters small, 26 letter caps, 0-9 digits 
		*/
		while(num > 0) {
			shortUrl.append(map[num % 62]);
			num = num / 62;
		}
		
		/*
		 * reverse shortURL to complete base conversion 
		*/
		
		return shortUrl.reverse().toString();
	}
	
	static int shortUrlToId(String shortUrl) {
		int id = 0;
		for (int i = 0; i < shortUrl.length(); i ++){
			if('a' <= shortUrl.charAt(i) &&  shortUrl.charAt(i) <= 'z') {
				id = id * 62 + shortUrl.charAt(i) - 'a';
			} if('A' <= shortUrl.charAt(i) &&  shortUrl.charAt(i) <= 'Z') {
				id = id * 62 + shortUrl.charAt(i) - 'A';
			} if('0' <= shortUrl.charAt(i) &&  shortUrl.charAt(i) <= '9') {
				id = id * 62 + shortUrl.charAt(i) - '0';
			}
		}
		return id;
	}
	
	public static void main(String[] args) {
		int n = 12345;
		String shortUrl = idToShortURL(n);
		System.out.println("Generated short URL: " + shortUrl);
		System.out.println("Short URL to Id: " + shortUrlToId(shortUrl));
	}
}
