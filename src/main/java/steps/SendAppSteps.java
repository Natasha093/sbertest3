package steps;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.InsurancePage;
import pages.SendAppPage;
import ru.yandex.qatools.allure.annotations.Step;
import org.openqa.selenium.WebDriver;

import java.util.Set;

import static org.junit.Assert.assertTrue;

public class SendAppSteps {


    @Step ("Заголовок равен {0}")
    public void checkTitle1 (String expectedTitle) {
        String actualTitle = new SendAppPage().title11.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));}

    @Step("Поле {0} заполняется значением {1}")
    public void fillField (String field, String value) {new SendAppPage().fillField(field, value);
    }
    @Step ("Нажать на кнопку {0}")
    public void Click2() {new SendAppPage().Click2();}

    @Step ("Нажать кнопку {1}")
    public void Click3 () {new SendAppPage().Click3();}

    @Step ("В поле {0} есть сообщение об ошибке {1}")
    public void checkFieldErrorMessage (String errorMessage) {new SendAppPage().checkFieldErrorMessage(errorMessage);}
}
