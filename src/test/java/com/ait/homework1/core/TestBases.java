package com.ait.homework1.core;

import com.phonebook.core.ApplicationManager;
import org.openqa.selenium.remote.Browser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.util.Arrays;

public class TestBases {

    protected ApplicationManager app;

    Logger logger = LoggerFactory.getLogger(TestBases.class);

    @BeforeMethod(alwaysRun = true)
    public void setUp(Method method, Object[] p) {
        logger.info("Start test {} with data: {}", method.getName(), Arrays.asList(p));
        // новий ApplicationManager на кожен тест
        app = new ApplicationManager(System.getProperty("browser", Browser.CHROME.browserName()));
        app.init();   // тут створюється свіжий WebDriver і відкривається baseUrl
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult result) {
        if (result.isSuccess()) {
            logger.info("PASSED: {}", result.getMethod().getMethodName());
        } else {
            logger.error("FAILED: {}", result.getMethod().getMethodName());
        }
        logger.info("Stop test");
        logger.info("********************************************");

        if (app != null) {
            app.stop();  // закриває драйвер після кожного тесту
        }
    }
}