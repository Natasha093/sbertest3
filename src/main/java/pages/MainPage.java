package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

/**
     * @author Наталья Ежова
     */
    public class MainPage {

        @FindBy(xpath = "//UL[@class='lg-menu__list']")
        WebElement menuItems;

        @FindBy(xpath = "(//UL[@class='lg-menu__sub-list'])[6]")
        WebElement menuInsurance;

        public MainPage(){
            PageFactory.initElements(BaseSteps.getDriver(), this);
        }

        public void selectMenuItem(String itemName){
            menuItems.findElement(By.xpath(".//span[@class='lg-menu__text'][contains(text(),'"+itemName+"')]")).click();
        }

        public void selectInsuranceItem(String itemName){
            menuInsurance.findElement(By.xpath(".//*[contains(text(),'"+itemName+"')]")).click();
        }

    }

