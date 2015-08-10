package stepDefinitions;

import static cucumber.Constants.*;
import static org.testng.AssertJUnit.assertTrue;
import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinitions {
	
	public static io.appium.java_client.AppiumDriver wd;

	@Before
	public void i_launch_the_app() throws Throwable {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appium-version", "1.4.0");
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("platformVersion", "7.1");
		capabilities.setCapability("deviceName", "iPad 2");
		capabilities.setCapability("app", "/Users/srs/Library/Developer/Xcode/DerivedData/Cisco_eReader-gmgwkwqgqfaegfaruzxitgkyrxrc/Build/Products/Debug-iphonesimulator/Cisco eReader.app");
		try 
		{
			wd = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		} 
		catch (MalformedURLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wd.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
	}
	
	
	@Given("^i launch the app$")
	

	@Then("^login screen is displayed$")
	public void login_screen_is_displayed() throws Throwable {
		assertTrue(isTextPresent("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAButton[1]"));
	    System.out.println("Login page is displayed");
	}

	@When("^i enter login credentials$")
	public void enter_credentials() throws Throwable {
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIATextField[1]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIATextField[1]")).sendKeys("hchiredd");
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIASecureTextField[1]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIASecureTextField[1]")).sendKeys("Bhuvika01");
		
	   System.out.println("I enter valid credentials");
	}

	@And("^i login to the app$")
	public void click_login() throws Throwable {
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAButton[1]")).click();
	   System.out.println("I clicked on login");
	}
	
	@Then("^i should see the home page$")
	public void home_page() throws Throwable {
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[1]")).
		System.out.println("I'm on the home page");
	}
	
	@Given("^i logged in to the app$")
	public void i_logged_in_to_the_app() throws Throwable {
		
		//assertTrue(isTextPresent("Cisco Leaning Network Space User Guide"));
	}
	
	@When("^i download book$")
	public void i_download_book() throws Throwable {
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[5]")).click();
		try {
			  Thread.sleep(10000);
			  wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[30]")).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Then("^book should be opened$")
	public void book_should_be_downloaded() throws Throwable {
		findDynamicElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[30]") ,200);
	}
	
	@Given("^i navigate to previous version settings$")
	public void i_navigate_to_previous_version_settings() throws Throwable {
		wd.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[19]")).click();
		wd.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
	}

	@When("^i download a previous version book$")
	public void i_download_a_previous_version_book() throws Throwable {
		try{
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[52]")).click();
		}
		catch(Exception e)
		{
	e.printStackTrace();
		}
		}

	@When("^i cancel a book download$")
	public void i_cancel_a_book_download() throws Throwable {
		wd.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[52]")).click();
	}

	@Then("^book download is canceled$")
	public void book_download_is_canceled() throws Throwable {
	 
	}
	

@Given("^student opens pagenote$")
public void student_opens_pagenote() throws Throwable {
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[4]")).click(); 
	 assertTrue(isTextPresent("Page Notes"));
	 wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIATextField[1]")).click();
	 
}

@When("^student adds note$")
public void student_adds_note() throws Throwable {
	 wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIATextField[1]")).sendKeys("Learning space");
	 //wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[4]")).click(); 
}

@Then("^page note should be saved$")
public void page_note_should_be_saved() throws Throwable {
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[4]")).click();
}

@And("^page note is saved in TOC pagenote list$")
public void page_note_is_saved_in_TOC_pagenote_list() throws Throwable {
	wd.findElement(By.xpath(TAPPAGE)).click();
	wd.findElement(By.xpath(TOC)).click();
	wd.findElement(By.xpath(TOCPAGENOTE)).click();
	assertTrue(isTextPresent("Cisco Learning"));
	wd.findElement(By.xpath(TOCBACK)).click();
}

@When("^student deletes note$")
public void student_deletes_note() throws Throwable {
//	wd.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
//	Thread.sleep(10000);
	wd.findElement(By.xpath(TAPPAGE)).click();
	wd.findElement(By.xpath(TAPPAGE)).click();
	wd.findElement(By.xpath(PAGENOTE)).click(); 
	//assertTrue(isTextPresent("Page Notes"));
	wd.findElement(By.xpath(PNTEXTFIELD)).click();
	 
	 JavascriptExecutor js = (JavascriptExecutor) wd;
	    HashMap<String, Double> tapObject = new HashMap<String, Double>();
	    tapObject.put("x", (double) 555);
	    tapObject.put("y", (double) 350);
	    tapObject.put("duration", 0.0);
	    tapObject.put("touchCount", 1.0);
	    tapObject.put("tapCount", 1.0);
	    js.executeScript("mobile: tap", tapObject);
	    wd.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
	 wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[4]/UIAEditingMenu[1]/UIAElement[17]")).click();
	 wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAKeyboard[1]/UIAKey[11]")).click();
	 wd.findElement(By.xpath(PAGENOTE)).click();
}

@Then("^page note should be deleted$")
public void page_note_should_be_deleted() throws Throwable {
  
}

@Then("^page note is removed in TOC pagenote list$")
public void page_note_is_removed_in_TOC_pagenote_list() throws Throwable {
    
}
	
@Given("^i navigate to a page$")
public void i_navigate_to_a_page() throws Throwable {
	 JavascriptExecutor js = (JavascriptExecutor) wd;
	    HashMap<String, Double> tapObject = new HashMap<String, Double>();
	    tapObject.put("x", (double) 751);
	    tapObject.put("y", (double) 444);
	    tapObject.put("duration", 0.0);
	    tapObject.put("touchCount", 1.0);
	    tapObject.put("tapCount", 1.0);
	    js.executeScript("mobile: tap", tapObject);
}

@When("^i select text to highlight$")
public void i_select_text_to_highlight() throws Throwable {
	JavascriptExecutor js = (JavascriptExecutor) wd;
    HashMap<String, Double> tapObject = new HashMap<String, Double>();
    tapObject.put("x", (double) 79);
    tapObject.put("y", (double) 89);
    tapObject.put("duration", 1.0);
    tapObject.put("touchCount", 1.0);
    tapObject.put("tapCount", 1.0);
    js.executeScript("mobile: tap", tapObject);
    
}

@Then("^i highlight the text$")
public void i_highlight_the_text() throws Throwable {
	wd.findElement(By.xpath(HIGHLIGHTTEXT)).click(); 

}

@Then("^text should be highlighted$")
public void text_should_be_highlighted() throws Throwable {
	wd.findElement(By.xpath(TAPPAGE)).click();
	wd.findElement(By.xpath(TOC)).click();
	wd.findElement(By.xpath(TOCHIGHLIGHT)).click();
	assertTrue(isTextPresent("Cisco"));
	wd.findElement(By.xpath(TOCBACK)).click();
	
}

@Then("^highlight is saved in TOC highlight list$")
public void highlight_is_saved_in_TOC_highlight_list() throws Throwable {
    
}

@Given("^i select the higlight$")
public void i_select_the_higlight() throws Throwable {
	JavascriptExecutor js = (JavascriptExecutor) wd;
    HashMap<String, Double> tapObject = new HashMap<String, Double>();
    tapObject.put("x", (double) 79);
    tapObject.put("y", (double) 89);
    tapObject.put("duration", 1.0);
    tapObject.put("touchCount", 1.0);
    tapObject.put("tapCount", 1.0);
    js.executeScript("mobile: tap", tapObject);
}

@When("^i delete the highlight$")
public void i_delete_the_highlight() throws Throwable {
	JavascriptExecutor js = (JavascriptExecutor) wd;
    HashMap<String, Double> tapObject = new HashMap<String, Double>();
    tapObject.put("x", (double) 79);
    tapObject.put("y", (double) 89);
    tapObject.put("duration", 0.0);
    tapObject.put("touchCount", 1.0);
    tapObject.put("tapCount", 1.0);
    
    js.executeScript("mobile: tap", tapObject);
	wd.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
     
}

@Then("^highlight should be deleted$")
public void highlight_should_be_deleted() throws Throwable {
	 wd.findElement(By.xpath(REMOVEHIGHLIGHT)).click();
}

@Then("^highlight is removed in TOC highlight list$")
public void highlight_is_removed_in_TOC_highlight_list() throws Throwable {
   
}

@Then("^i add note to the text$")
public void i_add_note_to_the_text() throws Throwable {
	JavascriptExecutor js = (JavascriptExecutor) wd;
    HashMap<String, Double> tapObject = new HashMap<String, Double>();
    tapObject.put("x", (double) 79);
    tapObject.put("y", (double) 89);
    tapObject.put("duration", 1.0);
    tapObject.put("touchCount", 1.0);
    tapObject.put("tapCount", 1.0);
    js.executeScript("mobile: tap", tapObject);
    wd.findElement(By.xpath(HIGHLIGHTNOTE)).click();
    wd.findElement(By.xpath(NOTETEXTFIELD)).click();
    wd.findElement(By.xpath(NOTETEXTFIELD)).sendKeys(TEXT);   
    wd.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
}

@Then("^note should be saved$")
public void note_should_be_saved() throws Throwable {
	wd.findElement(By.xpath(SAVENOTE)).click();
}

@Then("^highlightnote is saved in TOC highlight list$")
public void highlightnote_is_saved_in_TOC_highlight_list() throws Throwable {
   
}

@Then("^i delete note$")
public void i_delete_note() throws Throwable {
	JavascriptExecutor js = (JavascriptExecutor) wd;
    HashMap<String, Double> tapObject = new HashMap<String, Double>();
    tapObject.put("x", (double) 79);
    tapObject.put("y", (double) 89);
    tapObject.put("duration", 1.0);
    tapObject.put("touchCount", 1.0);
    tapObject.put("tapCount", 1.0);
    
    js.executeScript("mobile: tap", tapObject);
    wd.findElement(By.xpath(HIGHLIGHTNOTE)).click();
    wd.findElement(By.xpath(NOTETEXTFIELD)).click();
   
}

@Then("^note is deleted$")
public void note_is_deleted() throws Throwable {
	 wd.findElement(By.xpath(DELETENOTE)).click(); 
	 wd.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
}


@Then("^highlight note is removed in TOC highlight list$")
public void highlight_note_is_removed_in_TOC_highlight_list() throws Throwable {
   
}

@When("^i search for text$")
public void i_search_for_text() throws Throwable {
	JavascriptExecutor js = (JavascriptExecutor) wd;
    HashMap<String, Double> tapObject = new HashMap<String, Double>();
    tapObject.put("x", (double) 130);
    tapObject.put("y", (double) 240);
    tapObject.put("duration", 0.0);
    tapObject.put("touchCount", 1.0);
    tapObject.put("tapCount", 1.0);
    
    js.executeScript("mobile: tap", tapObject);
	wd.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
}

@Then("^result should be displayed$")
public void result_should_be_displayed() throws Throwable {
	wd.findElement(By.xpath(SEARCHFIELD)).click(); 
    wd.findElement(By.xpath(SEARCHFIELD)).sendKeys("Cisco"); 
}

@Given("^i navigate to settings in library page$")
public void i_navigate_to_settings_in_library_page() throws Throwable {
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[3]")).click();
	
}

@Then("^i should see settings$")
public void settings() throws Throwable {
     System.out.println("I'm able to see settings icon");
}
@When("^i Deregister a device$")
public void i_Deregister_a_device() throws Throwable {
	wd.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[7]")).click();
	
}

@Then("^device should be deregistered$")
public void device_should_be_deregistered() throws Throwable {
	wd.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[3]/UIAAlert[1]/UIATableView[2]/UIATableCell[1]")).click();
	wd.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
	assert(isElementPresent(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAButton[2]")));
}


@When("^i add a bookmark$")
public void i_add_a_bookmark() throws Throwable {
    
}

@Then("^bookmark should be added$")
public void bookmark_should_be_added() throws Throwable {
    
}

@When("^i naviagate to TOC$")
public void i_naviagate_to_TOC() throws Throwable {
	wd.findElement(By.xpath(TOC)).click();
	wd.findElement(By.xpath(TOCLIST)).click();
	
}

@Then("^i naviagte to a page through TOC$")
public void i_naviagte_to_a_page_through_TOC() throws Throwable {
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[10]")).click();
}


public boolean isElementPresent(By by) {
    try {
      wd.findElements(by);
      return true;
    } catch (org.openqa.selenium.NoSuchElementException e) {
      return false;
    }
}

public static WebElement findDynamicElement(By by, int timeOut)
	{
	WebDriverWait wait = new WebDriverWait(wd, timeOut);
    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[30]")).click();
    //element.click();
    return element;
	} 
	
protected static boolean isTextPresent(String text){
	    try{
	        boolean b = wd.getPageSource().contains(text);
	        return b;
	    }
	    catch(Exception e){
	        return false;
	    }
	  }
	
}

