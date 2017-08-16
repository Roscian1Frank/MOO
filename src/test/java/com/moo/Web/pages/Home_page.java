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
}
