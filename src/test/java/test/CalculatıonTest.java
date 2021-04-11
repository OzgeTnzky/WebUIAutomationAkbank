package test;

import com.thoughtworks.gauge.Step;
import model.CalculationModel;
import recorder.VideoRecorder;

public class CalculatıonTest {

    CalculationModel calculationModel = new CalculationModel();

    @Step("Enter <key>TL in 'TUTAR' field")
    public void setCreditPrice(String key){
        calculationModel.setCreditPrice(key);
    }

    @Step("Choose <key> in the button")
    public void chooseInsurance(String key){
        calculationModel.chooseInsurance(key);
    }

    @Step("Set VADE as <key> in the bar")
    public void chooseMaturity(String key){
        calculationModel.chooseMaturity(key);
    }

    @Step("Click 'Hesaplama Detayları'")
    public void clickCalculationDetails(){
        calculationModel.clickCalculationDetails();
    }

    @Step("Check <key> is opened")
    public void checkCostRatio(String key){
        calculationModel.checkCost(key);
    }

    @Step("Click 'Ödeme Planı'")
    public void clickPayment(){
        calculationModel.clickPaymentPlan();
    }

    @Step("Scroll down on the 'Ödeme Planı' page until 20th is seen")
    public void scrollToElement() throws Exception {
        calculationModel.scrollToLastElement();
    }
}
