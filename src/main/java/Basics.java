import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Basics {

    public static void main(String[] args) {
        // TODO Auto-generated method stub



        System.setProperty("webdriver.chrome.driver","C:\\Users\\mnagar\\Desktop\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demowebshop.tricentis.com/");
        driver.findElement(By.className("ico-register")).click();// use xpath (text)
        driver.findElement(By.name("Gender")).click();
        driver.findElement(By.id("FirstName")).sendKeys("mole");
        driver.findElement(By.id("LastName")).sendKeys("tyre");
        driver.findElement(By.id("Email")).sendKeys("mie786@gmail.com");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("moee@796");
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("moee@796");
        driver.findElement(By.xpath("//input[@id='register-button']")).click();
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']//div[3]//div[1]//div[2]//div[3]//div[2]//input[1]")).click(); // change xpath
        driver.findElement(By.linkText("Shopping cart")).click();
        //driver.findElement(By.xpath("//select[@id='CountryId']")).click();
        Select objselect = new Select (driver.findElement(By.id("CountryId")));
        objselect.selectByVisibleText("South Africa");
        driver.findElement(By.cssSelector("input.button-2.estimate-shipping-button")).click();
        driver.findElement(By.id("ZipPostalCode")).sendKeys("2020");
        driver.findElement(By.name("termsofservice")).click();
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
        Select objselect1 = new Select (driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']")));
        objselect1.selectByVisibleText("South Africa");
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("jhb");
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("1 hood");
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("2021");
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("0723251125");
        driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();
        driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
        driver.findElement(By.xpath("//input[@class='button-1 shipping-method-next-step-button']")).click();
        driver.findElement(By.xpath("//input[@class='button-1 payment-method-next-step-button']")).click();
        driver.findElement(By.className("button-1 payment-method-next-step-button")).click();
        driver.findElement(By.xpath("//input[@class='button-1 payment-info-next-step-button']")).click();



////div[@id='checkout-step-payment-info']//input[@value='Continue']



















        //driver.findElement(By.className("ico-login")).click();
        //driver.findElement(By.cssSelector("input.email")).sendKeys("milan.nagar786@gmail.com");
        //driver.findElement(By.cssSelector("input.password")).sendKeys("milan.nagar786@gmail.com");
        //driver.findElement(By.cssSelector("input.button-1.login-button")).click();





    }

}
