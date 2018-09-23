package steps;

import pages.InsurancePage;
import ru.yandex.qatools.allure.annotations.Step;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class InsuranceSteps {

    @Step ("Выполнено нажатие на ")
    public void goToSendAppPage() {new InsurancePage().sendButton.click();
    }

    @Step("Заголовок страницы равен {0}")
    public void checkTitle (String expectedTitle) {
        String actualTitle = new InsurancePage().title.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }

}
