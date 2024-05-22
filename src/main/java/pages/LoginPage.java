package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;

import factory.DriverFactory;
import utils.Objects;
import utils.WebActions;

public class LoginPage {
	private Page page;
	private final Locator USERNAME_EDITBOX;
	private final Locator PASSWORD_EDITBOX;
	private final Locator LOGIN_BUTTON;
	private final Locator BOOKS_SEARCH_BOX;
	private final Locator HOME_LINK;
	

	public LoginPage(Page page) {
		this.page = page;
		this.USERNAME_EDITBOX = page.locator("#userName");
		this.PASSWORD_EDITBOX = page.locator("#password");
		this.LOGIN_BUTTON = page.locator("#login");
		this.BOOKS_SEARCH_BOX = page.getByPlaceholder("Type to search");
		this.HOME_LINK = page.locator("//a[contains(@href ,'demo')]");
	}

	public void navigateToUrl(String url) throws InterruptedException {
		this.page.navigate(WebActions.getProperty(url));
		page.waitForLoadState();
	}

	public void enterUsername(String username) {
		if (WebActions.waitUntilElementDisplayed(this.USERNAME_EDITBOX, 60) == true) {
			USERNAME_EDITBOX.fill(WebActions.getProperty(username));
		}
	}

	public void enterPassword(String password) {
		PASSWORD_EDITBOX.fill(WebActions.decrypt(password));
	}

	public void clickLogin() {
		LOGIN_BUTTON.click();
	}

	public void clickOnIcon(String iconName) {

		Locator bookstore = this.page.getByText(iconName, new Page.GetByTextOptions().setExact(true)); // Clicks on the
																										// Exact text
		if (WebActions.waitUntilElementDisplayed(bookstore, 60) == true)

		{
			bookstore.click();
		}
	}

	public boolean verifyProfilePage() {
		return WebActions.waitUntilElementDisplayed(this.BOOKS_SEARCH_BOX, 10);
	}

	public void clickHomePage() {
		this.HOME_LINK.click();
	}
}
