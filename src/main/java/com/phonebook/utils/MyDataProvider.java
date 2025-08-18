package com.phonebook.utils;

import com.phonebook.models.UserData;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class MyDataProvider {
    @DataProvider()
    public Iterator<Object[]> addNewUser() {
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"Olivia", "Jonson", "Oli1231*", "olivkaa124@de.com"});
        list.add(new Object[]{"Julia", "Schneider", "schneider*", "Julii09@gmail.com"});
        return list.iterator();
    }

@DataProvider
public Iterator<Object[]> addNewUserFromCsv() throws IOException {
    List<Object[]> list = new ArrayList<>();
    BufferedReader reader = new BufferedReader
            (new FileReader(new File("src/test/resources/user.csv")));
    String line = reader.readLine();
    while (line != null) {
        String[] split = line.split(",");
        list.add(new Object[]{new UserData().setUserName(split[0]).setUserLastName(split[1]).setPassword(split[2]).setEmail(split[3])});
        line = reader.readLine();
    }
    return list.iterator();

}}
