import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class LambdaGitHubTest {

    @Test
    public void findIssueWithSteps() {
        step("Открываем репозиторий", () -> {
            open("https://github.com/artemioskr/qaguru4");
        });

        step("Ищем Issue и кликаем", () -> {
            $(withText("Issue")).click();
        });

        step("Ищем issue по названию", () -> {
            $("#js-issues-toolbar").parent().shouldHave(text("Issue for test"));
        });
    }
}
