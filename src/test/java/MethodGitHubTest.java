import org.junit.jupiter.api.Test;

public class MethodGitHubTest {
    @Test
    void findIssueWithMethods() {
        BaseSteps steps = new BaseSteps();

        steps.openRepository();
        steps.openIssueAndClick();

        steps.checkIssueIsVisible("Issue for test");
    }
}
