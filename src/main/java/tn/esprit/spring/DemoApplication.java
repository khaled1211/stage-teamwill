package tn.esprit.spring;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import tn.esprit.spring.entities.Suivi;
import tn.esprit.spring.repository.SuiviRepository;
import tn.esprit.spring.service.SuiviServiceImpl;

@SpringBootApplication

public class DemoApplication implements CommandLineRunner {
	@Autowired
	SuiviRepository suivirepository;
	@Autowired
	SuiviServiceImpl suiviservice;

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("*");
			}
		};

	}

	@Override
	public void run(String... args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\seliniumchrome\\chromedriver.exe");
		ChromeDriver webdriver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) webdriver;
		JavascriptExecutor JavascriptExecutor = ((JavascriptExecutor)webdriver);
		webdriver.navigate().to("https://www.udemy.com/mobile/ipad/");
		Thread.sleep(3000);



		webdriver.manage().window().maximize();
		Thread.sleep(3000);

		JavascriptExecutor.executeScript("alert('Clicker sur inscrire');");
		

		Thread.sleep(3000);
		webdriver.findElement(By.xpath("//span[text()='S’inscrire']")).click();
		 Date dd=new Date();
			Suivi se=new Suivi();
			se.setContenu(" ");
			se.setTache("click");
			se.setDate(dd);
			se.setNote(1);
			 suiviservice.addSuivi(se);	
		Thread.sleep(4000);
		
		JavascriptExecutor.executeScript("alert('Maintenant taper ton nom et ton prenom');");
		Thread.sleep(3000);
		webdriver.findElement(By.name("fullname")).sendKeys("Taper ton nom et ton prenom");
		Thread.sleep(2000);
		webdriver.findElement(By.name("fullname")).clear();
	
	
			Thread.sleep(3000);
					
		String fullname=webdriver.findElement(By.name("fullname")).getAttribute("value");
		
		 Date ddd=new Date();
			Suivi see=new Suivi();
			see.setContenu(fullname);
			see.setDate(ddd);
			see.setTache("input");
		see.setNote(se.getNote()+1);
		suiviservice.addSuivi(see);
		
		Thread.sleep(5000);
		
		
		  JavascriptExecutor.executeScript("alert('Maintenant taper ton email');");
		  Thread.sleep(5000);
		 
		  
		 
		webdriver.findElement(By.id("email--1")).sendKeys("email de la forme *@gmail.com");
		Thread.sleep(3000);
		webdriver.findElement(By.id("email--1")).clear();
		Thread.sleep(3000);
		
		String mail=webdriver.findElement(By.id("email--1")).getAttribute("value");
		Date dddd=new Date();
		Suivi seee=new Suivi();
		seee.setContenu(mail);
		seee.setDate(dddd);
		seee.setTache("input");
	seee.setNote(see.getNote()+1);
	suiviservice.addSuivi(seee);
		Thread.sleep(5000);
		  JavascriptExecutor.executeScript("alert('Maintenant taper password');");
		  Thread.sleep(5000);
	
		 
		String pwd=webdriver.findElement(By.id("password")).getAttribute("value");
		Date ddddd=new Date();
		Suivi seeee=new Suivi();
		seeee.setContenu("pwd");
		seeee.setDate(ddddd);
		seeee.setTache("input");
	seeee.setNote(seee.getNote()+1);
	suiviservice.addSuivi(seeee);
		Thread.sleep(4000);
		
		System.out.println(fullname);
		System.out.println(mail);
		System.out.println(pwd);
		 JavascriptExecutor.executeScript("alert('Maintenant taper inscrire');");
		 Thread.sleep(4000);
		
	
		 
		
		webdriver.findElement(By.name("submit")).click();
		Date d1=new Date();
		
		
		  Suivi ss=new Suivi(); 
		  ss.setContenu("");
		  ss.setTache("click");
		  ss.setDate(d1);
		  ss.setNote(seeee.getNote()+1);
		  
		  suiviservice.addSuivi(ss);
		 	
		
		Thread.sleep(3000);
		JavascriptExecutor.executeScript("alert('Maintenant taper le cours a chercher');");
		Thread.sleep(8000);
		webdriver.findElement(By.name("q"));
		
		  String cherche=webdriver.findElement(By.name("q")).getAttribute("value");
			Thread.sleep(5000);
			Date d2=new Date();
			
			
			  Suivi s2=new Suivi(); 
			  s2.setContenu( cherche);
			  s2.setTache("input");
			  s2.setDate(d2);
			  s2.setNote(ss.getNote()+1);
			  
			  suiviservice.addSuivi(s2);
			 	
			
			JavascriptExecutor.executeScript("alert('Maintenant taper entrer');");
			Thread.sleep(8000);


		  webdriver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		 
		
		Thread.sleep(4000);
		
		js.executeScript("window.scrollBy(0,300)");
		Date d3=new Date();
		
		
		  Suivi s3=new Suivi(); 
		  s3.setContenu("");
		  s3.setTache("scrollMouse");
		  s3.setDate(d3);
		  s3.setNote(s2.getNote()+1);
		  
		  suiviservice.addSuivi(s3);
		 	
		Thread.sleep(2000);
		
		webdriver.findElement(By.tagName("p")).click();
		Date d4=new Date();
		
		
		  Suivi s4=new Suivi(); 
		  s4.setContenu("");
		  s4.setTache("click");
		  s4.setDate(d4);
		  s4.setNote(s3.getNote()+1);
		  
		  suiviservice.addSuivi(s4);
		 	

		Thread.sleep(3000);
		JavascriptExecutor.executeScript("alert('Clicker sur le  button Ajouter au panier ');");
		Thread.sleep(5000);
		webdriver.findElement(By.xpath("//button[text()='Ajouter au panier']")).click();
		Date d5=new Date();
		
		
		  Suivi s5=new Suivi(); 
		  s5.setContenu("");
		  s5.setTache("click");
		  s5.setDate(d5);
		  s5.setNote(s4.getNote()+1);
		  
		  suiviservice.addSuivi(s5);
		 	
		Thread.sleep(5000);
		
		
		
		
		JavascriptExecutor.executeScript("alert(' Clicker sur le Button accéder au panier ');");
		Thread.sleep(5000);
		webdriver.findElement(By.xpath("//span[contains(text(),'Accéder au panier')]")).click();
		Thread.sleep(3000);
		Date d6=new Date();
		
		
		  Suivi s6=new Suivi(); 
		  s6.setContenu("");
		  s6.setTache("click");
		  s6.setDate(d6);
		  s6.setNote(s5.getNote()+1);
		  
		  suiviservice.addSuivi(s6);
			JavascriptExecutor.executeScript("alert('Bravo vous avez atteint notre objectif ');");
			Thread.sleep(5000);
			webdriver.close();
		
		
	}
}
