package com.github.onsdigital.test.browser.PageObjects;

import com.github.davidcarboni.cryptolite.Random;
import com.github.onsdigital.selenium.PageObjectException;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class PublishingQueuePage extends FlorencePage {

    By publishTableLocator = By.className("publish-select-table");

    WebElement publishTable;

    public PublishingQueuePage(WebDriver driver) {
        super(driver);
        initialisePage();
    }

    /**
     * Check the expected elements are located in the page.
     */
    protected PublishingQueuePage initialisePage() {
        try {
            super.initialisePage();

            publishTable = waitAndFind(publishTableLocator);
        } catch (NoSuchElementException exception) {
            throw new PageObjectException("Failed to recognise the " + this.getClass().getSimpleName() + " contents.", exception);
        }

        return this;
    }
}

