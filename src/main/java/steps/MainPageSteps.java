package steps;

import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;
import org.openqa.selenium.WebDriver;

public class MainPageSteps {
    @Step ("Выбран пункт меню {0}")
    public void selectMenuItem(String menuItem) {new MainPage().selectMenuItem(menuItem);
    }

    @Step ("Выбран вид страхования {0}")
    public void selectInsuranceItem(String menuItem) {new MainPage().selectInsuranceItem(menuItem);
    }
}
