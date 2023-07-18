package com.orangeHRM.e2eTests.PIM.pages;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangeHRM.e2eTests.utils.Setup;

public class PimPage {
	
	/*Locators*/
	final static String MODULE_PIM_ID = "menu_pim_viewPimModule";
	final static String BUTTON_ADD_ID = "btnAdd";
	final static String FIRST_NAME_ID = "firstName";
	final static String LAST_NAME_ID = "lastName";
	final static String PHOTO_FILE_ID = "photofile";
	final static String BUTTON_LOGIN_ID = "chkLogin";
	final static String USER_NAME_ID = "user_name";
	final static String USER_PASSWORD_ID = "user_password";
	final static String CONFIRM_PASSWORD_ID = "re_password";
	final static String SELECT_ID = "status";
	final static String BUTTON_SAVE_ID = "btnSave";
	final static String PROFILE_ID = "profile-pic";
	
	/*FindBy*/
	@FindBy(how = How.ID, using = MODULE_PIM_ID)
	public static WebElement modulePim;
	@FindBy(how = How.ID, using = BUTTON_ADD_ID)
	public static WebElement btnAdd;
	@FindBy(how = How.ID, using = FIRST_NAME_ID)
	public static WebElement firstName;
	@FindBy(how = How.ID, using = LAST_NAME_ID)
	public static WebElement lastName;
	@FindBy(how = How.ID, using = PHOTO_FILE_ID)
	public static WebElement photo;
	@FindBy(how = How.ID, using = BUTTON_LOGIN_ID)
	public static WebElement btnLogin;
	@FindBy(how = How.ID, using = USER_NAME_ID)
	public static WebElement userName;
	@FindBy(how = How.ID, using = USER_PASSWORD_ID)
	public static WebElement userPassword;
	@FindBy(how = How.ID, using = CONFIRM_PASSWORD_ID)
	public static WebElement confirmPassword;
	@FindBy(how = How.ID, using = SELECT_ID)
	public static WebElement status;
	@FindBy(how = How.ID, using = BUTTON_SAVE_ID)
	public static WebElement btnSave;
	@FindBy(how = How.ID, using = PROFILE_ID)
	public static WebElement profile;
	
	public WebDriverWait wait;
	public WebDriver driver;
	public String fileName = "src/test/resources/fileProfile.txt";
	
	
	public PimPage() {
		driver = Setup.driver;
		//PageFactory.initElements(driver, EmployeePage.class);
	}
	/*Methods*/
	public void clickOnPim() throws InterruptedException {
		modulePim.click();
	}
	public void clickOnAdd() throws InterruptedException {
		Thread.sleep(2000);
		btnAdd.click();
	}
	public void fillUserName(String firstname, String lastname) throws InterruptedException {
		createFile(fileName);
		firstName.sendKeys(firstname);
		writeFile(fileName,firstname);
		lastName.sendKeys(lastname);
		//writeFile(fileName,lastname);
		
		
	}	
	public void uploadPhoto(String path) throws InterruptedException {
		
		//wait.until(ExpectedConditions.elementToBeClickable(photo));
		Actions builder = new Actions(driver);
		builder.moveToElement(photo).click().build().perform();
		StringSelection stringSelection = new StringSelection(path);
		Clipboard clipBoard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipBoard.setContents(stringSelection, null);
		
		Robot robot = null;
		try {
			robot = new Robot();
		}catch (AWTException e) {
			e.printStackTrace();
		}
		
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(150);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	public void clickOnCheckLogin() throws InterruptedException {
		btnLogin.click();
	}
	public void fillCredentials(String name, String password, String repassword) throws InterruptedException {
		userName.sendKeys(name);
		userPassword.sendKeys(password);
		confirmPassword.sendKeys(repassword);
		Thread.sleep(5000);
	}	
	public void selectStatus(String value) throws InterruptedException {
	Select se = new Select(status);
	se.selectByValue(value);
	Thread.sleep(5000);
	}
	public void clickSave() throws InterruptedException {
		btnSave.click();
		Thread.sleep(5000);
	}
	
	/*Create text file*/
	
	public void createFile(String file) {
		try {
		      File myObj = new File(file);
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }
	
	/*Write text file*/
	
	public void writeFile(String file, String name) {
		try {
		      PrintWriter myWriter = new PrintWriter(new FileWriter(file,true));
		      myWriter.write(name);
		      myWriter.write(" ");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}

	 
	/*Read text file*/
	
	public String readFile(String file) {
		String data = null;
		try {
		      File myObj = new File(file);
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		return data;
		
		  }
	
	

}
