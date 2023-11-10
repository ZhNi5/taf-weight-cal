package by.itacademy.zhiznevskaya;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Assertions;
public class WeightCalcTest {

    @Test
    public void testFormWithEmptyValues( )
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        String clickSubmitXpath = "//input[@type=\"submit\"]";
        By submitXpathBy = By.xpath(clickSubmitXpath);
        WebElement submitElement = driver.findElement(submitXpathBy);
        submitElement.click();
        //assertEquals(char expected, char actual, String message)
        String ExpectedMessage="Не указано имя.\n" +
                "Рост должен быть в диапазоне 50-300 см.\n" +
                "Вес должен быть в диапазоне 3-500 кг.\n" +
                "Не указан пол.";
        String expectedMessageTextXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b";
        By expectedMessageTextXpathBy = By.xpath(expectedMessageTextXpath);
        WebElement textElement = driver.findElement(expectedMessageTextXpathBy);
        String actualMessage =textElement.getText();
        Assertions.assertEquals(ExpectedMessage,actualMessage);
        //driver.close();
    }
}
