package tn.esprit.spring;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TeamWillApplication1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Downloads\\seliniumchrome\\chromedriver.exe");
		ChromeDriver webdriver=new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) webdriver;

		webdriver.navigate().to("https://www.udemy.com/mobile/ipad/");
		Thread.sleep(3000);



		webdriver.manage().window().maximize();
		webdriver.findElement(By.xpath("//span[text()='S’inscrire']")).click();
		
		
		//JavascriptExecutor.executeScript("alert('Mainetant taper ton nom');");
	//	Thread.sleep(5000);
		
		
	
	
			Thread.sleep(5000);
					
		webdriver.findElement(By.name("fullname")).sendKeys("khaled khaled");
		
		Thread.sleep(5000);
		
		/*
		 * JavascriptExecutor.executeScript("alert('Mainetant taper ton nom');");
		 * Thread.sleep(5000);
		 */
		  
		 
	
		
		
		webdriver.findElement(By.id("email--1")).sendKeys("kh.dfgfvvgd@gmail.com");
		Thread.sleep(5000);
		
		webdriver.findElement(By.id("password")).sendKeys("@azerty123");
		Thread.sleep(6000);
		webdriver.findElement(By.name("submit")).click();
		
		Thread.sleep(3000);
		
		
		  webdriver.findElement(By.name("q")).sendKeys("java");
			Thread.sleep(3000);

		  webdriver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		 
		
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(3000);
		
		webdriver.findElement(By.tagName("p")).click();

		Thread.sleep(4000);
		
		webdriver.findElement(By.xpath("//button[text()='Ajouter au panier']")).click();
		
		Thread.sleep(5000);
		
		webdriver.findElement(By.xpath("//span[contains(text(),'Accéder au panier')]")).click();
	
		
	}

}
