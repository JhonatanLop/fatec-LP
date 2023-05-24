package org.openjfx.travel.utils;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;

public class DocumentsMask extends TextField{

    public DocumentsMask() {
        applyCpfMask();
    }

    private void applyCpfMask() {
        setTextFormatter(new TextFormatter<>(change -> {
            String newText = change.getControlNewText();
            if (newText.matches("\\d{0,3}(\\.\\d{0,3}){0,2}(\\-\\d{0,2})?")) {
                return change;
            }
            return null;
        }));
    }
}
