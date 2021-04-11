package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeModel extends BaseModel{

    public By btnCreditCalculation = By.id("ctl00_ucFooterMenu_rptMain_ctl02_rptChild_ctl00_linkChild");

    public void goToUrl(String key){
        webDriver.get(key);
    }

    public void clickCreditCalculation(){
        clickElement(btnCreditCalculation);
    }
}
