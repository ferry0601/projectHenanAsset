package henan.web;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import henan.web.drivers.DriverSingleton;
import henan.web.pages.Product2Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class TestProduct2 {
    static WebDriver driver;
    static ExtentTest extentTest;
    static Product2Page product2Page = new Product2Page();

    public TestProduct2() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //scenario
    @Given("access url {string}")
    public void access_url(String url) {
        driver.get(url);
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS,"access url");
    }

    @Then("Validasi URL product")
    public void validasi_url_product() {
        Assert.assertEquals(product2Page.getvalidUrl(),"Ultima Money Market");
        extentTest.log(LogStatus.PASS,"Validasi URL product");
        DriverSingleton.delay(1);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
    }


    @When("User klik {string}")
    public void user_klik(String button) {
        DriverSingleton.delay(1);
        product2Page.setClickGrafik(button);
        extentTest.log(LogStatus.PASS,"User klik tombol");

    }
    @Then("Validasi {string}")
    public void validasi_dan( String persen) {
        DriverSingleton.delay(1);
        Assert.assertEquals(product2Page.setValidasiGrafik(),persen);
        extentTest.log(LogStatus.PASS,"validasi persen");
    }

    @Given("scroll")
    public void scroll(){
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        extentTest.log(LogStatus.PASS,"SCROLL");
    }


    @When("Masukkan investasi {string}")
    public void masukkan_investasi(String nilai) {
        DriverSingleton.delay(1);
        product2Page.setInputUang(nilai);
        extentTest.log(LogStatus.PASS,"masukkan harga investasi");
    }
    @And("Masukkan jangka {string}")
    public void masukkan_jangka(String tahun) {
        DriverSingleton.delay(2);
        product2Page.setInputTahun(tahun);
        extentTest.log(LogStatus.PASS,"masukkan jangka tahun");
    }
    @Then("Menampilkan {string} dan {string}")
    public void menampilkan_dan(String hasil, String type) {
        DriverSingleton.delay(1);
        Assert.assertEquals(product2Page.setValidasiSimulasi(),hasil);
        System.out.println(type);
        extentTest.log(LogStatus.PASS,"menampilkan return");
    }




    @When("klik document prospectus")
    public void klik_document_prospectus() {
        product2Page.lookFile();
        extentTest.log(LogStatus.PASS,"klik document prospectus");
    }
    @When("klik document fun fact sheet")
    public void klik_document_fun_fact_sheet() {
        product2Page.seeSheet();
        extentTest.log(LogStatus.PASS,"klik document fun fact sheet");
    }
}
