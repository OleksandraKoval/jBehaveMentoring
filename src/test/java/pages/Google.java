package pages;


import com.codeborne.selenide.SelenideElement;
import decoratorPattern.IGetFoundResults;
import factoryPattern.TestedPage;
import net.thucydides.core.annotations.DefaultUrl;

import static com.codeborne.selenide.Selenide.$x;

public class Google extends TestedPage implements IGetFoundResults {
    private SelenideElement elementUnderTest;

    public SelenideElement input = $x("//input[@class='gLFyf gsfi']");
    public SelenideElement result = $x("//div[@id='result-stats']");

    public Google() {
        super();
    }

    public Google(SelenideElement elementUnderTest) {
        super();
        this.elementUnderTest = elementUnderTest;
    }

    @Override
    public String getFoundResults() {
        return elementUnderTest.getText();
    }
}
