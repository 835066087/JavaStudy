package test;

public class Test2 {
	
	public static void main(String[] args) {
		String str = fileExtNameFromUrl("http://localhost:8080/testweb/index.html");
		System.out.println(str);
	}
	
	public static String fileExtNameFromUrl(String url){
		return url.substring(url.lastIndexOf('.')+ 1);
	}

}
