package Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Base.TestBase;

public class Homepage extends TestBase{

	
public static final long TIMEOUT = 30;

	

	public Homepage() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//li[contains(@class,'hl-cat-nav__js-tab')]/a[contains(text(),'Electronics')]")
	WebElement electronics;
	
	@FindBy(xpath="//div[contains(text(),'Top Electronic Deals')]")
	WebElement electronnicsgoods;
	
	@FindBy(xpath="//div[contains(@class,'slashui-image-cntr')]")
	List<WebElement> selects;
	
	@FindBy(xpath="//span[contains(text(),'Buy It Now')]")
	WebElement Buyitnow;
	
	@FindBy(xpath="//span[contains(text(),'Check out as guest')]")
	WebElement checkout_as_guest;
	
	public void HomepageforBuying() throws IOException, InterruptedException {
		electronics.click();
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" User has successfully click electronics", ExtentColor.GREEN));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(TIMEOUT);
		logger.log(Status.PASS, MarkupHelper.createLabel(" window has been scrolled down", ExtentColor.GREEN));
		electronnicsgoods.click();
		logger.log(Status.PASS, MarkupHelper.createLabel(" Electronics goods is clicked", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,350)", "");
		logger.log(Status.PASS, MarkupHelper.createLabel(" window has been scrolled down", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		selects.get(1).click();
		logger.log(Status.PASS, MarkupHelper.createLabel(" product is selected", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		Buyitnow.click();
		logger.log(Status.PASS, MarkupHelper.createLabel(" Buying a product", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
		checkout_as_guest.click();
		logger.log(Status.PASS, MarkupHelper.createLabel("Check out for payment", ExtentColor.GREEN));
		Thread.sleep(TIMEOUT);
	}
}
