/*
 * package javaallpgmspackage;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * public class Dowhile {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * int i= 1;
 * 
 * do{
 * 
 * // driver.get(
 * "https://ark.intel.com/products/series/97941/Intel-Atom-Processor-C-Series");
 * 
 * System.out.println("Value enetered ins correct");
 * 
 * } while (i==1);
 * 
 * 
 * System.setProperty("webdriver.gecko.driver",
 * "C:\\Users\\nshibaha\\Desktop\\WORK\\AUTOMATION\\drivers\\geckodriver-v0.21.0-win64\\geckodriver.exe"
 * );
 * 
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Users\\nshibaha\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
 * 
 * 
 * 
 * ChromeDriver driver = new ChromeDriver();
 * 
 * String produrl
 * ="https://ark.intel.com/products/series/97941/Intel-Atom-Processor-C-Series";
 * 
 * 
 * WebElement processorelement
 * =driver.findElement(By.xpath("//span[@class='name processors show-icon']"));
 * 
 * 
 * do{
 * 
 * // driver.get(
 * "https://ark.intel.com/products/series/97941/Intel-Atom-Processor-C-Series");
 * 
 * driver.get("https://ark.intel.com");
 * 
 * } while (!processorelement.isDisplayed());
 * 
 * }
 * 
 * }
 */