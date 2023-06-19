package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage1 {

    WebDriver driver = null;

    public HomePage1(WebDriver driver) {
        this.driver = driver;

    }
    public void setSearchText(String value) {
        String Loc = "//*[@id=\"layers\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[5]/label/div/div[2]/div/input";
        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.sendKeys(value);
    }
    public void clickSearchButton() {
        String Loc = "//*[@id=\"layers\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[6]/div";

        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.click();
    }
    public void setSearchText1(String value) {
        String Loc = "//*[@id=\"layers\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div/div[3]/div/label/div/div[2]/div[1]/input";
        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.sendKeys(value);
    }
    public void clickSearchButton1() {
        String Loc = " //*[@id=\"layers\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div/div/div";

        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.click();
    }
    //*[@id="layers"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div/div/div
}