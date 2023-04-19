package org.example.app.utils;

import org.example.app.database.PassReader;

public final class Constants {

    // DB
    public final static String DB_DRIVER = "jdbc:mysql://localhost:3306/";
    public final static String DB_NAME = "shop_online";

    public final static String PATH_MYSQL_CREDS = "mysql_creds/";
    public final static String DB_USER = "dev";
    public final static String DB_PASS = PassReader.readPass();

    public final static String TABLE_POSITIONS = "positions";
    public final static String TABLE_EMPLOYEES = "employees";

    // Regex for phone is formatted xxx xxx-xxxx
    public final static String PHONE_RGX = "[0-9]{3}[\\ ][0-9]{3}-[0-9]{4}";
    public final static String WRONG_PHONE_MSG = "Wrong phone format.";

    public final static String NAME_RGX = "^[A-Z]{1}[a-z]{2,31}";
    public final static String WRONG_FIRSTNAME_MSG = "Wrong first name.";
    public final static String WRONG_LASTNAME_MSG = "Wrong last name.";

//    Regex for email is formatted name@mail.com
/*    public final static String EMAIL_RGX = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
    public final static String WRONG_EMAIL_MSG = "Wrong email."; */

    //  Regex for birthDate is formatted yyyy-mm-dd
    public final static String BIRTH_DATE_RGX = "[0-9]{4}-(1[0-2]|0[1-9])-(3[01]|[12][0-9]|0[1-9])";
    public final static String WRONG_DATE_MSG = "Wrong birth date.";

    public final static String INCORRECT_VALUE_MSG = ">> Incorrect value! Try again...";
    public final static String APP_CLOSE_MSG = "\n>> App closed.";
    public final static String INPUT_REQ_MSG = "Input required.";
    public final static String SMTH_WRONG_MSG = "Something wrong.";
    public final static String DATA_INSERT_MSG = "\n>> Created.";
    public final static String DATA_ABSENT_MSG = "\n>> No data!";
    public final static String DATA_DELETE_MSG = "\n>> Deleted.";
    public final static String ID_NO_EXISTS_MSG = "There is no such ID.";

}
