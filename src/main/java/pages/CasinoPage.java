package pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CasinoPage extends MainPage {

    public CasinoPage() throws Exception {
        super();
    }


    @FindBy(css = "div[class='gi-casino-search-box'] input")
    protected WebElement searchFieldElement;
    @FindBy(css = "svg-button[class='gi-casino-search-box__icon gi-casino-search-box__icon_remove gi-svg-button ng-scope ng-isolate-scope']")
    protected WebElement crossIconSearchFieldElement;
    @FindBy(css = "svg-button[class='gi-casino-search-box__icon gi-casino-search-box__icon_search gi-svg-button ng-isolate-scope']")
    protected WebElement searchIconSearchFieldElement;
    @FindBy(css = "h1[class='gi-casino-empty-section__header ng-scope']")
    protected WebElement searchResultHeaderElement;
    @FindBy(css = "p[class='gi-casino-empty-section__text ng-scope']")
    protected WebElement searchResultBodyElement;
    @FindBy(css = "a[title='Favourites']")
    protected WebElement favoriteIconElement;
    @FindBy(xpath = "//div[contains(@class,'favorites-counter')]")
    protected WebElement favoriteNumberElement;

    @FindBy(xpath = "//div[normalize-space(text()) = 'olegMgAutotest']//ancestor::casino-game[@game='game']")
    protected WebElement mgGameElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegMgAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__play ng-scope']")
    protected WebElement mgGamePlayElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegMgAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__demo ng-scope']")
    protected WebElement mgGameDemoElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegMgAutotest']//ancestor::casino-game[@game='game']//descendant::button[contains(@class,'gi-casino-game__favorite')]")
    protected WebElement mgGameFavouriteElement;

    @FindBy(xpath = "//*[normalize-space(text()) = 'olegRelaxAutotest']//ancestor::casino-game[@game='game']")
    protected WebElement relaxGameElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegRelaxAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__play ng-scope']")
    protected WebElement relaxGamePlayElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegRelaxAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__demo ng-scope']")
    protected WebElement relaxGameDemoElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegRelaxAutotest']//ancestor::casino-game[@game='game']//descendant::button[contains(@class,'gi-casino-game__favorite')]")
    protected WebElement relaxGameFavouriteElement;

    @FindBy(xpath = "//*[normalize-space(text()) = 'olegPlayngoAutotest']//ancestor::casino-game[@game='game']")
    protected WebElement playngoGameElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegPlayngoAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__play ng-scope']")
    protected WebElement playngoGamePlayElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegPlayngoAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__demo ng-scope']")
    protected WebElement playngoGameDemoElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegPlayngoAutotest']//ancestor::casino-game[@game='game']//descendant::button[contains(@class,'gi-casino-game__favorite')]")
    protected WebElement playngoGameFavouriteElement;

    @FindBy(xpath = "//*[normalize-space(text()) = 'olegIssoftAutotest']//ancestor::casino-game[@game='game']")
    protected WebElement issoftGameElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegIssoftAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__play ng-scope']")
    protected WebElement issoftGamePlayElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegIssoftAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__demo ng-scope']")
    protected WebElement issoftGameDemoElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegIssoftAutotest']//ancestor::casino-game[@game='game']//descendant::button[contains(@class,'gi-casino-game__favorite')]")
    protected WebElement issoftGameFavouriteElement;

    @FindBy(xpath = "//*[normalize-space(text()) = 'olegEvolutionAutotest']//ancestor::casino-game[@game='game']")
    protected WebElement evolutionGameElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegEvolutionAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__play ng-scope']")
    protected WebElement evolutionGamePlayElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegEvolutionAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__demo ng-scope']")
    protected WebElement evolutionGameDemoElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegEvolutionAutotest']//ancestor::casino-game[@game='game']//descendant::button[contains(@class,'gi-casino-game__favorite')]")
    protected WebElement evolutionGameFavouriteElement;

    @FindBy(xpath = "//*[normalize-space(text()) = 'olegYggdrasilAutotest']//ancestor::casino-game[@game='game']")
    protected WebElement yggdrasilGameElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegYggdrasilAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__play ng-scope']")
    protected WebElement yggdrasilGamePlayElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegYggdrasilAutotest']//ancestor::casino-game[@game='game']//descendant::span[@class = 'md-trigger gi-casino-buttons__demo ng-scope']")
    protected WebElement yggdrasilGameDemoElement;
    @FindBy(xpath = "//div[normalize-space(text()) = 'olegYggdrasilAutotest']//ancestor::casino-game[@game='game']//descendant::button[contains(@class,'gi-casino-game__favorite')]")
    protected WebElement yggdrasilGameFavouriteElement;



    @FindBy (css = "div[id='login-popup']")
    protected WebElement loginPopupElement;
    @FindBy (xpath = "//svg-button[contains(@class,'gi-modal-header__close')]")
    protected WebElement loginPopupCrossElement;
    @FindBy (xpath = "//h2[contains(@class,'gi-login-form__title')]")
    protected WebElement loginPopupTitleElement;
    @FindBy (css = "input[name='login']")
    protected WebElement loginFieldLoginPopupElement;
    @FindBy (css = "input[type='password']")
    protected WebElement passwordFieldLoginPopupElement;
    @FindBy (xpath = "//a[contains(@class,'lostpass')]")
    protected WebElement lostPasswordLoginPopupElement;
    @FindBy (xpath = "//button[contains(@class,'gi-but-login')]")
    protected WebElement loginButtonPopupElement;
    @FindBy (xpath = "//a[contains(@class,'but-join')]")
    protected WebElement joinNowButtonPopupElement;
    @FindBy(css = "div[id='errorMessage']")
    protected WebElement incorrectLoginMessagePopupElement;
    @FindBy(css = "div[class='buttons messenger-but']")
    protected WebElement incorrectLoginMessageOkButtonPopupElement;


    public WebElement getSearchFieldElement() { return getClickableElement(searchFieldElement); }
    public WebElement getCrossIconSearchFieldElement() { return getClickableElement(crossIconSearchFieldElement); }
    public WebElement getSearchIconSearchFieldElement() { return getClickableElement(searchIconSearchFieldElement); }
    public WebElement getSearchResultHeaderElement() { return searchResultHeaderElement; }
    public WebElement getSearchResultBodyElement() { return searchResultBodyElement; }
    public WebElement getFavoriteIconElement() { return favoriteIconElement; }
    public WebElement getFavoriteNumberElement() { return favoriteNumberElement; }

    public WebElement getMgGameElement() { return mgGameElement; }
    public WebElement getMgGamePlayElement() { return mgGamePlayElement; }
    public WebElement getMgGameDemoElement() { return mgGameDemoElement; }
    public WebElement getMgGameFavouriteElement() { return getEnabledElement(mgGameFavouriteElement); }

    public WebElement getRelaxGameElement() { return relaxGameElement; }
    public WebElement getRelaxGamePlayElement() { return relaxGamePlayElement; }
    public WebElement getRelaxGameDemoElement() { return relaxGameDemoElement; }
    public WebElement getRelaxGameFavouriteElement() { return getEnabledElement(relaxGameFavouriteElement); }

    public WebElement getPlayngoGameElement() { return playngoGameElement; }
    public WebElement getPlayngoGamePlayElement() { return playngoGamePlayElement; }
    public WebElement getPlayngoGameDemoElement() { return playngoGameDemoElement; }
    public WebElement getPlayngoGameFavouriteElement() { return getEnabledElement(playngoGameFavouriteElement); }


    public WebElement getIssoftGameElement() { return issoftGameElement; }
    public WebElement getIssoftGamePlayElement() { return issoftGamePlayElement; }
    public WebElement getIssoftGameDemoElement() { return issoftGameDemoElement; }
    public WebElement getIssoftGameFavouriteElement() { return getEnabledElement(issoftGameFavouriteElement); }


    public WebElement getEvolutionGameElement() { return evolutionGameElement; }
    public WebElement getEvolutionGamePlayElement() { return evolutionGamePlayElement; }
    public WebElement getEvolutionGameDemoElement() { return evolutionGameDemoElement; }
    public WebElement getEvolutionGameFavouriteElement() { return getEnabledElement(evolutionGameFavouriteElement); }

    public WebElement getYggdrasilGameElement() { return yggdrasilGameElement; }
    public WebElement getYggdrasilGamePlayElement() { return yggdrasilGamePlayElement; }
    public WebElement getYggdrasilGameDemoElement() { return yggdrasilGameDemoElement; }
    public WebElement getYggdrasilGameFavouriteElement() { return getEnabledElement(yggdrasilGameFavouriteElement); }

    public WebElement getLoginPopupElement() { return loginPopupElement; }
    public WebElement getLoginPopupCrossElement() { return loginPopupCrossElement; }
    public WebElement getLoginPopupTitleElement() { return loginPopupTitleElement; }
    public WebElement getLoginFieldLoginPopupElement() { return getClickableElement(loginFieldLoginPopupElement); }
    public WebElement getPasswordFieldLoginPopupElement() { return passwordFieldLoginPopupElement; }
    public WebElement getLostPasswordLoginPopupElement() { return lostPasswordLoginPopupElement; }
    public WebElement getLoginButtonPopupElement() { return loginButtonPopupElement; }
    public WebElement getJoinNowButtonPopupElement() { return joinNowButtonPopupElement; }
    public WebElement getIncorrectLoginMessagePopupElement() { return incorrectLoginMessagePopupElement; }
    public WebElement getIncorrectLoginMessageOkButtonPopupElement() { return getEnabledElement(incorrectLoginMessageOkButtonPopupElement); }


    public String getTextSearchFieldElement() { return getClickableElement(searchFieldElement).getAttribute("placeholder"); }
    public String getTextSearchResultHeaderElement() { return getEnabledElement(searchResultHeaderElement).getText(); }
    public String getTextSearchResultBodyElement() { return getEnabledElement(searchResultBodyElement).getText(); }
    public String getTextFavoriteNumberElement() { return getEnabledElement(favoriteNumberElement).getText(); }




    public void search(String data){
        waitIfElementIsClickable(getSearchFieldElement());
        getSearchFieldElement().sendKeys(data);
    }

    public void addToFavourites(WebElement element){
        waitIfElementIsEnabled(element);
        clickIfElementIsClickable(element);
    }
    public void removeFromFavourites(WebElement element){
        waitIfElementIsEnabled(element);
        clickIfElementIsClickable(element);
    }

    public void fillLoginInPopup(String login) { getLoginFieldLoginPopupElement().sendKeys(login); }

    public void fillPasswordInPopup(String password) { getPasswordFieldLoginPopupElement().sendKeys(password); }

    public void clickLoginButtonInPopup() { clickIfElementIsClickable(getLoginButtonPopupElement()); }

    public void loginByPopup(String login, String password) {
        fillLoginInPopup(login);
        loginFieldLoginPopupElement.sendKeys(Keys.TAB);
        fillPasswordInPopup(password);
        passwordFieldLoginPopupElement.sendKeys(Keys.TAB);
        clickLoginButtonInPopup();
    }

}
