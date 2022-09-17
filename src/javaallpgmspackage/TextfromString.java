package javaallpgmspackage;

public class TextfromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String url ="http://www.youtube-nocookie.com/embed/zaaU9lJ34c5?rel=0";
		
		
		String url=	"https://tst1aemcontent-ssl.cps.intel.com/content/www/us/en/secure/care/products/series/87722/Intel-Xeon-Processor-E3-v4-Family.html";
				
		String str = url.substring(url.lastIndexOf("/") + 1, url.indexOf(".html"));
		String afterlowercase =str.toLowerCase();
		
		String removedurl = url.replaceAll(str, "");
		
		String removedurlhtml = removedurl.replaceAll(".html", "");
		
		String finalurlold= removedurlhtml.concat(afterlowercase);
		
		String finalurllatest= finalurlold.concat(".html");
		
		
		System.out.println("afterlowercase " +afterlowercase);
		
		System.out.println(removedurl);
		System.out.println(removedurlhtml);
		
		System.out.println("Intial url "+url);
		System.out.println("finalurl "+finalurllatest);
		
		
		
		
		
		

	}

}
