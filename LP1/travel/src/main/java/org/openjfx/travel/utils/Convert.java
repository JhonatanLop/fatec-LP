package org.openjfx.travel.utils;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;

import javafx.scene.control.TextField;

public class Convert {

    // public static Date convertToDate(LocalDate localDate) {
    //     return (Date) Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    // }

    public static java.sql.Date convertToDate(LocalDate localDate) {
        System.out.println(java.sql.Date.valueOf(localDate));
        return java.sql.Date.valueOf(localDate);
    }

    public static int convertToInt(TextField str) {
        String text = str.getText();
        try {
            return Integer.parseInt(text);
        } finally {
            // str.setText("");
        }
    }
}
