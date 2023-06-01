module org.travel {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens org.openjfx.travel to javafx.fxml;
    opens org.openjfx.travel.controllers to javafx.fxml;
    exports org.openjfx.travel;
}
