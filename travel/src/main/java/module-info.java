module org.travel {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.travel to javafx.fxml;
    exports org.travel;
}
