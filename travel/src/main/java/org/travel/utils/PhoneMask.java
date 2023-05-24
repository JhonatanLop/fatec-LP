package org.travel.utils;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;

public class PhoneMask extends TextField {

    public PhoneMask() {
        applyPhoneMask();
    }

    private void applyPhoneMask() {
        setTextFormatter(new TextFormatter<>(change -> {
            String newText = change.getControlNewText();
            if (newText.matches("\\(\\d{0,3}\\)\\s?\\d{0,4}\\-?\\d{0,4}")) {
                return change;
            }
            return null;
        }));
    }
}
