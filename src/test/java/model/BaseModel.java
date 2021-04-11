package model;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseModel extends Driver {

    WebDriverWait wait = new WebDriverWait(webDriver,20);

    public void elementClickable(By by){

        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void elementAppear(By by){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public WebElement findElement(By by){
        elementAppear(by);
        return webDriver.findElement(by);
    }

    public void clickElement(By by) {
        elementClickable(by);
        findElement(by).click();
    }

    public void sendKeys(By by, String text){
        elementClickable(by);
        findElement(by).sendKeys(text);
    }

    public void clear(By by){
        findElement(by).clear();
    }

    public void scrollDownToBottom(){
        ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public boolean isElementVisible(By by) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
