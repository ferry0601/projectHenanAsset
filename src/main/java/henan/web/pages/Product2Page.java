package henan.web.pages;

import henan.web.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class Product2Page {
    private WebDriver driver;

    public Product2Page() {
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }


    //locator
    @FindBy(xpath = "//div[@class='css-1lhy0r8']/h1")
    WebElement validasiUrl;
    @FindBy(xpath = "(//div[@class='css-1yjo05o']/div[1]/span)[1]")
    WebElement oneDay;
    @FindBy(xpath = "(//div[@class='css-1yjo05o']/div[2]/span)[1]")
    WebElement oneMonth;
    @FindBy(xpath = "(//div[@class='css-1yjo05o']/div[3]/span)[1]")
    WebElement threemonth;
    @FindBy(xpath = "(//div[@class='css-1yjo05o']/div[4]/span)[1]")
    WebElement YTD;
    @FindBy(xpath = "(//div[@class='css-1yjo05o']/div[5]/span)[1]")
    WebElement oneYear;
    @FindBy(xpath = "(//div[@class='css-1yjo05o']/div[6]/span)[1]")
    WebElement threeYear;
    @FindBy(xpath = "(//div[@class='css-1yjo05o']/div[7]/span)[1]")
    WebElement fiveYear;
    //    @FindBy(xpath = "//*[text()='22 Nov 2024']")
//    WebElement validasioneDay;
//    @FindBy(xpath = "//*[text()='24 Okt 2024']")
//    WebElement validasioneMonth;
//    @FindBy(xpath = "//*[text()='9 Sep 2024']")
//    WebElement validasithreeMonth;
//    @FindBy(xpath = "//*[text()='17 Jan 2024']")
//    WebElement validasiYTD;
//    @FindBy(xpath = "//*[text()='15 Des 2023']")
//    WebElement validasioneYear;
//    @FindBy(xpath = "//*[text()='3 Feb 2022']")
//    WebElement validasithreeYear;
//    @FindBy(xpath = "//*[text()='15 Apr 2020']")
//    WebElement validasifiveYear;
    @FindBy(xpath = "//div[@class='css-1lhy0r8']/p[1]")
    WebElement validasiPersen;
    @FindBy(xpath = "//input[@id=':r0:']")
    WebElement inputUang;
    @FindBy(xpath = "//input[@id=':r1:']")
    WebElement inputTahun;
    @FindBy(xpath = "//div[@class='css-j7qwjs']/p[2]")
    WebElement hasilSimulasi;
    @FindBy(xpath = "//*[text()='Prospectus']")
    WebElement filePropecBtn;
    @FindBy(xpath = "//*[text()='Fund Fact Sheet']")
    WebElement fileFactSheetBtn;


    //method
    public String getvalidUrl(){
        return validasiUrl.getText();
    }
    public void setClickGrafik(String timed){
        if (timed.equals("1D")){
            oneDay.click();
        } else if (timed.equals("1M")) {
            oneMonth.click();
        } else if (timed.equals("3M")){
            threemonth.click();
        } else if (timed.equals("YTD")){
            YTD.click();
        } else if (timed.equals("1Y")) {
            oneYear.click();
        } else if (timed.equals("3Y")) {
            threeYear.click();
        } else if (timed.equals("5Y")){
            fiveYear.click();
        }
    }

    public String setValidasiGrafik(){
        return validasiPersen.getText();
//        if (result.equals("0.01%")){
//            return validasioneDay.getText();
//        } else if (result.equals("0.46%")) {
//            return validasioneMonth.getText();
//        } else if (result.equals("1.35%")) {
//            return validasithreeMonth.getText();
//        } else if (result.equals("4.61%")){
//            return validasiYTD.getText();
//        } else if (result.equals("5.13%")) {
//            return validasioneYear.getText();
//        } else if (result.equals("14.25%")) {
//            return validasithreeYear.getText();
//        } else if (result.equals("26.95%")){
//            return validasifiveYear.getText();
//        } else {
//            throw new IllegalArgumentException("Invalid result value: " + result);
//        }
    }

    public void setInputUang(String angka){
        inputUang.click();
        for (int i=1;i<=9;i++){
            inputUang.sendKeys(Keys.BACK_SPACE);
        }
        inputUang.sendKeys(angka);
        inputUang.sendKeys(Keys.ENTER);
    }
    public void setInputTahun(String tahun){
        inputTahun.click();
        for (int i=1;i<=5;i++){
            inputTahun.sendKeys(Keys.BACK_SPACE);
        }
        inputTahun.sendKeys(tahun);
        inputTahun.sendKeys(Keys.ENTER);
    }
    public String setValidasiSimulasi(){
        return hasilSimulasi.getText();
    }

    public void lookFile(){
        filePropecBtn.click();
        DriverSingleton.delay(1);
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
    }
    public void seeSheet(){
        fileFactSheetBtn.click();
        DriverSingleton.delay(1);
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
    }
}
