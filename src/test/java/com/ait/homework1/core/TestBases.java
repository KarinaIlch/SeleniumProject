package com.ait.homework1.core;

import com.phonebook.core.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBases {

    protected static ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp(){
        app.init();
    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        app.stop();
    }

}

