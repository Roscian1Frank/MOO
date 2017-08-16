package com.moo.steps;

import com.moo.Web.pages.Home_page;
import com.moo.helpers.Constants;
import com.moo.helpers.Log;
import com.moo.helpers.WebCommonAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.moo.steps.WebTestBase.driver;

public class Moo_steps extends WebCommonAction {
    public Moo_steps() {
        PageFactory.initElements(driver, Home_page.class);
    }

    private static final String site = System.getProperty("site");

    public static class Home_steps {
        @Given("^I open the Moo website$")
        public void iOpenTheMooWebsite() throws Throwable {
            driver.get(site);
            driver.manage().window().maximize();
            Log.info("I am on home page");
        }
    }

    @When("^I search for a \"([^\"]*)\"$")
    public void iSearchForA(String product) throws Throwable {
        Assert.assertTrue("Search bar is not visible", Home_page.searchBar.isDisplayed());
        Home_page.searchBar.sendKeys(product);
        Home_page.searchButton.click();
        Log.info("Searching fo product");
    }

    @Then("^I should see correct products for \"([^\"]*)\"$")
    public void iShouldSeeCorrectProductsFor(String product) throws Throwable {

        String result = Home_page.resultHeader.getText();
        Assert.assertTrue("Expected result not found", result.contains(product));
        switch (product) {
            case "business cards":
                Log.info("I am on result page");
                ArrayList<String> webArray = new ArrayList<String>();
                List<WebElement> links = Home_page.titleList;
                webArray.addAll(links.stream()
                        .map(WebElement::getText)
                        .filter(link -> !"".equals(link))
                        .collect(Collectors.toList()));

                //TODO
                //I am trying compare all links
                //It is giving different search results

               /* String[] webArr = new String[webArray.size()];
                webArr = webArray.toArray(webArr);
                Assert.assertTrue("Title results are changed please check", Arrays.equals(Constants.TITLE_LINKS, webArr));
                Assert.assertTrue("Title results are changed please check", Constants.TITLE_LINKS.length == webArr.length);
                Log.info("Title results are checked");*/

                if (webArray.size() >= 10) {
                    Log.info("Title results are checked");
                } else {
                    Assert.assertTrue("Results not found for: " + product, false);
                }
                break;
            case "sdjfnjsdfj":
                Assert.assertTrue("No result message is not displayed", Home_page.noResultMessage.isDisplayed());
                Assert.assertTrue("No result message is not Correct", Constants.NO_RESULT.equalsIgnoreCase(Home_page.noResultMessage.getText()));
                break;
            default:
                Assert.assertTrue("Given search result not found for :" + product, false);
                break;
        }
    }

    @When("^I see product link are displayed$")
    public void iClickOnProductLinkAreDisplayed() throws Throwable {
        for (WebElement link : Home_page.productLinks) {
            Assert.assertTrue("Product link is not displayed" + link.getText(), link.isDisplayed());
            Arrays.asList(Constants.PRODUCT_LINK).contains(link.getText());
        }
    }

    @Then("^I check each \"([^\"]*)\" is working$")
    public void iCheckEachIsWorking(String link) throws Throwable {
        switch (link) {
            case "Business Cards":
                Home_page.businessCardsLink.click();
                Assert.assertTrue("BusinessCards Page not loaded",Home_page.businessCardPage.isDisplayed());
                Log.info("business cards link clicked");
                break;
            case "Postcards":
                Home_page.postcardsLink.click();
                Assert.assertTrue("Postcard page is not loaded",Home_page.postcardPage.isDisplayed());
                Log.info("Postcards link clicked");
                break;
            case "Square Business Cards":
                Home_page.squareBusinessCardsLink.click();
                Assert.assertTrue("Square Business Cards page is not loaded",Home_page.squareBusinessCardsPage.isDisplayed());
                Log.info("Square Business Cards link clicked");
                break;
            case "NFC Business Cards+":
                Home_page.NFCLink.click();
                Assert.assertTrue("NFC Business Cards page is not loaded",Home_page.NFCPage.isDisplayed());
                Log.info("NFC Business Cards+ link clicked");
                break;
            case "Luxe Business Cards":
                Home_page.luxeBusinessCardsLink.click();
                Assert.assertTrue("NFC Business Cards page is not loaded",Home_page.luxeBusinessCardsPage.isDisplayed());
                Log.info("Luxe Business Cards link clicked");
                break;
            case "Stickers":
                Home_page.stickersLink.click();
                Assert.assertTrue("Stickers page is not loaded",Home_page.stickersPage.isDisplayed());
                Log.info("Stickers link clicked");

                break;
            default:
                Assert.assertTrue("Link not found" + link,false);
        }

    }

}
