package com.moo.Web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Home_page {

    @FindBy(id = "query")
    public static WebElement searchBar;

    @FindBy(xpath = "//*[@id='search']/div/button")
    public static WebElement searchButton;

    @FindBy(xpath = "//h1")
    public static WebElement resultHeader;

    @FindBy(xpath = "//*[@class = 'gs-title']/a")
    public static List<WebElement> titleList;

    @FindBy(xpath = "//*[@class='gs-snippet']")
    public static WebElement noResultMessage;

    @FindBy(xpath = "//*[@class='u-ph']")
    public static List<WebElement> productLinks;

    @FindBy(linkText = "Business Cards")
    public static WebElement businessCardsLink;

    @FindBy(xpath = "//h2[text()='Shop Business Cards by Paper']")
    public static WebElement businessCardPage;

    @FindBy(linkText = "Postcards")
    public static WebElement postcardsLink;

    @FindBy(xpath = "//*[text()='Choose the Perfect Postcard Paper Stock']")
    public static WebElement postcardPage;

    @FindBy(linkText = "Square Business Cards")
    public static WebElement squareBusinessCardsLink;

    @FindBy(xpath = "//*[text()='Perfect Paper Stocks']")
    public static WebElement squareBusinessCardsPage;

    @FindBy(linkText = "NFC Business Cards+")
    public static WebElement NFCLink;

    @FindBy(xpath = "//*[text()='What are Business Cards+?']")
    public static WebElement NFCPage;

    @FindBy(linkText = "Luxe Business Cards")
    public static WebElement luxeBusinessCardsLink;

    @FindBy(xpath = "//*[text()='then there’s Luxe']")
    public static WebElement luxeBusinessCardsPage;

    @FindBy(linkText = "Stickers")
    public static WebElement stickersLink;

    @FindBy(xpath = "//*[text()='Our durable stickers come in three versatile sizes.']")
    public static WebElement stickersPage;

}
