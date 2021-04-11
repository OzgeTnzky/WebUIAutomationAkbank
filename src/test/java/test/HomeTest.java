package test;

import com.thoughtworks.gauge.Step;
import model.BaseModel;
import model.HomeModel;

public class HomeTest {

    HomeModel homeModel = new HomeModel();
    BaseModel baseModel = new BaseModel();

    @Step("Enter <key> Akbank Home Page")
    public void goToUrl(String key) throws Exception {
        homeModel.goToUrl(key);
    }

    @Step("Scroll down to the bottom of the page")
    public void scrollDownToBottom(){
        baseModel.scrollDownToBottom();
    }

    @Step("Click on 'Kredi Hesaplama'")
    public void clickCalculator(){
        homeModel.clickCreditCalculation();
    }

}
