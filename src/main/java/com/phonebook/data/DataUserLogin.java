package com.phonebook.data;

public class DataUserLogin {

        public static final String EMAIL = "rosaliaw1@de.com";
        public static final String PASSWORD = "Qwert09_poi";

    public static String newEmail() {
    int i = (int) (System.currentTimeMillis() / 1000 % 3600);
    return "rosalia" + i + "@gmail.com";
}
}