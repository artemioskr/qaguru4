import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BaseSteps {
    @Step("Открываем репозиторий")
    void openRepository() {
        open("https://github.com/artemioskr/qaguru4");
    }

    @Step("Ищем Issue и кликаем")
    void openIssueAndClick() {
        $(withText("Issue")).click();
    }

    @Step("Ищем issue по названию")
    void checkIssueIsVisible(String name) {
        $("#js-issues-toolbar").parent().shouldHave(text(name));
    }
}
