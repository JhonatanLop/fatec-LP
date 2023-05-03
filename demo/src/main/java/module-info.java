module com.atividade {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.atividade to javafx.fxml;
    exports com.atividade;
}
