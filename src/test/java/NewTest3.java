import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import pages.InsurancePage;
import pages.MainPage;
import pages.SendAppPage;
import ru.yandex.qatools.allure.annotations.Title;
import steps.BaseSteps;
import steps.InsuranceSteps;
import steps.MainPageSteps;
import steps.SendAppSteps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import static org.junit.Assert.assertTrue;


/**
 * @author Ежова Наталья
 */

public class NewTest3 extends BaseSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();
    InsuranceSteps InsSteps = new InsuranceSteps();
    SendAppSteps sendAppateps = new SendAppSteps();

    @Title("Заявка на страхование")

    @Test
    public void newInsuranceTest () {

        mainPageSteps.selectMenuItem("Страхование");
        mainPageSteps.selectInsuranceItem("Путешествия и покупки");

      WebDriver driver = BaseSteps.getDriver();
        Set<String> oldWindowsSet = driver.getWindowHandles();
        InsSteps.checkTitle("Страхование путешественников");
        InsSteps.goToSendAppPage();

        Set<String> newWindowsSet = driver.getWindowHandles();
        newWindowsSet.removeAll(oldWindowsSet);
        String newWindowHandle = newWindowsSet.iterator().next();
        driver.switchTo().window(newWindowHandle);

        sendAppateps.checkTitle1("Выбор полиса");

        sendAppateps.Click2();

        sendAppateps.fillField("Фамилия /Surname", "IVANOV");
        sendAppateps.fillField("Имя / Given names", "IVAN");
        sendAppateps.fillField("Фамилия", "Иванов");
        sendAppateps.fillField("Имя", "Иван");
        sendAppateps.fillField("Отчество", "Иванович");

        sendAppateps.Click3();

        sendAppateps.checkFieldErrorMessage("Заполнены не все обязательные поля");

    }
}

