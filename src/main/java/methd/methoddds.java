package methd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class methoddds {
	
WebDriver driver;
public methoddds(WebDriver driver)
{
	this.driver=driver;
}
By nam = By.xpath("//*[@id=\"name\"]");
By company = By.xpath("//*[@id=\"company\"]");
By email = By.xpath("//*[@id=\"email\"]");
By password = By.xpath("//*[@id=\"password\"]");
By password1 = By.xpath("//*[@id=\"password-confirm\"]");
By button1 = By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
public void setvalues(String name,String Company, String e_mail, String pass,String pass1)
{
	driver.findElement(nam).sendKeys(name);
	driver.findElement(company).sendKeys(Company);
	driver.findElement(email).sendKeys(e_mail);
	driver.findElement(password).sendKeys(pass);
	driver.findElement(password1).sendKeys(pass1);
}
public void clickk()
{
	driver.findElement(button1).click();
}

}
