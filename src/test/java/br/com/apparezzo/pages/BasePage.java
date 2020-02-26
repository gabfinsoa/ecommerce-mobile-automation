package br.com.apparezzo.pages;

import java.net.MalformedURLException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import br.com.apparezzo.stepdef.Hook;
import io.appium.java_client.TouchAction;

import static java.lang.Thread.sleep;

public class BasePage extends Hook{
	
	public BasePage(Hook hook) {
	}

	public static boolean exist(final By locator) {
				try{
					getDriver().findElement(locator);
					return true;
				}catch(Exception e){
					return false;
				}
	}

	public ExpectedCondition<Boolean> elementClicked(final By locator) {
		return new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {
				WebElement element = null;
				boolean validate = false;
				for(int i = 0; i < 150; i++) {
					if(validate == false) {
						try {
							Thread.sleep(200);
							validate = exist(locator);
							element = getDriver().findElement(locator);
							i++;
						} catch (MalformedURLException | InterruptedException e) {
							e.printStackTrace();
							validate = false;
						}
					}
				}
				element.click();
				return true;
			}
		};
	}

	public ExpectedCondition<Boolean> elementTyped(final By locator, final String key) {
		return new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {
				WebElement element = null;
				boolean validate = false;
				for(int i = 0; i < 150; i++) {
					if(validate == false) {
						try {
							Thread.sleep(200);
							validate = exist(locator);
							element = getDriver().findElement(locator);
							i++;
						} catch (MalformedURLException | InterruptedException e) {
							e.printStackTrace();
							validate = false;
						}
					}
				}
				element.sendKeys(key);
				return true;
			}
		};
	}

	public ExpectedCondition<Boolean> elementClean(final By locator) {
		return new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {
				WebElement element = null;
				boolean validate = false;
				for(int i = 0; i < 150; i++) {
					if(validate == false) {
						try {
							Thread.sleep(200);
							validate = exist(locator);
							element = getDriver().findElement(locator);
							i++;
						} catch (MalformedURLException | InterruptedException e) {
							e.printStackTrace();
							validate = false;
						}
					}
				}
				element.clear();
				return true;
			}
		};
	}

	public ExpectedCondition<String> elementGetText(final By locator) {
		return new ExpectedCondition<String>() {
			@Override
			public String apply(WebDriver driver) {
				WebElement element = null;
				boolean validate = false;
				for(int i = 0; i < 150; i++) {
					if(validate == false) {
						try {
							Thread.sleep(200);
							validate = exist(locator);
							element = getDriver().findElement(locator);
							i++;
						} catch (MalformedURLException | InterruptedException e) {
							e.printStackTrace();
							validate = false;
						}
					}
				}
				String text = element.getText();
				return text;
			}
		};
	}

	public void click(By element) {
		waiting().until(elementClicked(element));
	}
	
	public String getText(By element) {
		return waiting().until(elementGetText(element));
	}
	
	public void clear(By element) {
		waiting().until(elementClean(element));
	}
	
	public void sendKeys(By element, String key) {
		waiting().until(elementTyped(element,key));
	}
	
	public String emailnovo() {
		Random rand = new Random();
		long code = rand.nextInt(999999999) + rand.nextInt(999999999);
		String email = "rrsetcwi+"+code+"@gmail.com";
		return email;
	}
	
//	public void scroll(double startPercentage, double endPercentage) throws MalformedURLException {
//		Dimension size = getDriver().manage().window().getSize();
//	    int anchor = (int) (size.width * .50);
//	    int startPoint = (int) (size.height * startPercentage);
//	    int endPoint = (int) (size.height * endPercentage);
//		TouchAction touch = new TouchAction(getDriver());
//		touch.press(anchor,startPoint).moveTo(anchor,endPoint).release().perform();
//	}
//	
//	public void swipeTo() throws MalformedURLException {
//		TouchActions touch = new TouchActions(getDriver());
//		touch.scroll(10, 100);
//		touch.perform();
//	}
	
//	public void scrollDown() throws MalformedURLException {
//	    //if pressX was zero it didn't work for me
//	    int pressX = getDriver().manage().window().getSize().width / 2;
//	    // 4/5 of the screen as the bottom finger-press point
//	    int bottomY = getDriver().manage().window().getSize().height * 4/5;
//	    // just non zero point, as it didn't scroll to zero normally
//	    int topY = getDriver().manage().window().getSize().height / 8;
//	    //scroll with TouchAction by itself
//	    scroll(pressX, bottomY, pressX, topY);
//	}


	
	public void scrollDown() throws MalformedURLException {
	    int pressX = getDriver().manage().window().getSize().width / 2;
	    int bottomY = getDriver().manage().window().getSize().height * 4/5;
	    int topY = getDriver().manage().window().getSize().height / 8;
	    scroll(pressX, bottomY, pressX, topY);
	}


	public void scroll(int fromX, int fromY, int toX, int toY) throws MalformedURLException {
	    TouchAction touchAction = new TouchAction(getDriver());
	    touchAction.longPress(fromX,fromY).moveTo(toX,toY).release().perform();
	}
	
//	public void verticalSwipeByPercentages(double startPercentage, double endPercentage, double anchorPercentage) {
//	        Dimension size = getDriver().manage().window().getSize();
//	        int anchor = (int) (size.width * anchorPercentage);
//	        int startPoint = (int) (size.height * startPercentage);
//	        int endPoint = (int) (size.height * endPercentage);
////	        System.out.println("anchor: "+anchor+" - start: "+startPoint+" - end: "+endPoint);
//	        new TouchAction(getDriver())
//	                .press(point(anchor, startPoint))
//	                .waitAction(waitOptions(ofMillis(1000)))
//	                .moveTo(point(anchor, endPoint))
//	                .release().perform();
//	}
	


}
