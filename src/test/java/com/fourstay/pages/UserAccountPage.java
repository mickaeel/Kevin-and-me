package com.fourstay.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fourstay.utilities.Driver;

public class UserAccountPage {
	private WebDriver drier;

	public UserAccountPage() {
		this.drier = Driver.getInstance();
		PageFactory.initElements(drier, this);
	}

	@FindBy(css = "h3.user-name")
	public WebElement accountHolderName;

	@FindBy(xpath = "//h3[@class='row zrl-margin headings-with-icon ng-binding']")
	public WebElement message;
	// write an xpath that matches message no matter who you login as

	@FindBy(css = "[ng-if=\"userImage\"]")
	public WebElement profilePicture;

	// escape character \

	@FindBy(linkText = "Edit Profile")
	public WebElement editProfile;
	

}





