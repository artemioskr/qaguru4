import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class GitHubIssueTest {

    @Test
    void findIssue() {
        open("https://github.com/artemioskr/qaguru4");
        $(withText("Issue")).click();
        $("#js-issues-toolbar").parent().shouldHave(text("Issue for test"));
    }
}
