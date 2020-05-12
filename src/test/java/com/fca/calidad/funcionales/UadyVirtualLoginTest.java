package com.fca.calidad.funcionales;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UadyVirtualLoginTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUadyVirtualLogin() throws Exception {
    driver.get("https://es.uadyvirtual.uady.mx/");
    driver.findElement(By.xpath("//div[@id='page-header']/div/div")).click();
    driver.findElement(By.xpath("//nav[@id='essentialnavbar']/div/div/div/div/div/div/ul/li/a/em")).click();
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("a15211336");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("Kiara123");
    driver.findElement(By.id("loginbtn")).click();
    assertTrue(driver.findElement(By.xpath("//img[@alt='Imagen de FRANCISCO MISAEL MARIN ECHEVERRIA']")).isDisplayed());
  }
  @Test
  public void testUadyVirtualLoginTestFail() throws Exception {
    driver.get("https://es.uadyvirtual.uady.mx/");
    driver.findElement(By.linkText("Ingresar")).click();
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("a15211336");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("Kiara1234");
    driver.findElement(By.id("loginbtn")).click();
    // Warning: assertTextPresent may require manual changes
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Datos erróneos\\. Por favor, inténtelo otra vez\\.[\\s\\S]*$"));
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
