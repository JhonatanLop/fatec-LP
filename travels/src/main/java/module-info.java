module com.travels {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.travels to javafx.fxml;
    exports com.travels;
}
