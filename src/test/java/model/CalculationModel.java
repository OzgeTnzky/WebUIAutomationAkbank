package model;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class CalculationModel extends BaseModel{

    Actions action = new Actions(webDriver);

    public By txtCreditPrice = By.id("t-credit-price");
    public By tblCreditCalculation = By.className("multiple-module-head");
    public By chkUninsured = By.xpath("//label[@for='insuredType2']");
    public By chkInsured = By.xpath("//label[@for='insuredType1']");
    public By hoverBall = By.className("ui-slider-range-min");
    public By calculationDetails = By.className("open-tooltip");
    public By checkCostRatio = By.xpath("//div[@class='tabs-content oran active'][@id='content-1']");
    public By checkPaymentPlan = By.xpath("//div[@class='tabs-content plan active jspScrollable'][@id='content-2']");
    public By btnPaymentPlan = By.id("accordion2");
    public By scrollLastElement = By.xpath("//*[@class='table2']//tr[21]");
    public By jspDrag = By.className("jspDrag");

    public void setCreditPrice(String text){
        clear(txtCreditPrice);
        sendKeys(txtCreditPrice,text);
    }

    public void chooseInsurance(String key){
        scrollToElement(findElement(tblCreditCalculation));
        switch (key) {
            case "SİGORTASIZ":
                clickElement(chkUninsured);
                break;
            case "SİGORTALI":
                clickElement(chkInsured);
                break;
            default:
                System.out.println("Existing value selected");
        }
    }

    public void chooseMaturity(String key){
        switch (key) {
            case "20AY":
                action.dragAndDropBy(findElement(hoverBall),10,0).build().perform();
                break;
            default:
                System.out.println("Existing value selected");
        }
    }

    public void clickCalculationDetails(){
        clickElement(calculationDetails);
    }

    public boolean checkCost(String key){
        switch (key) {
            case "Masraf ve Maliyet Oranları":
                return isElementVisible(checkCostRatio);
            case "Ödeme Planı":
                return isElementVisible(checkPaymentPlan);
            default:
                return false;
        }
    }

    public void clickPaymentPlan(){

        clickElement(btnPaymentPlan);
    }

    public void scrollToLastElement(){
        scrollToElement(findElement(checkPaymentPlan));
        action.dragAndDropBy(findElement(jspDrag),0,300).build().perform();
    }
}
