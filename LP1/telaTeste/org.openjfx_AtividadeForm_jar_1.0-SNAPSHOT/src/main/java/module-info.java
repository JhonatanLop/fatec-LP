module org.openjfx.atividade {
    requires transitive javafx.controls;
    requires transitive javafx.fxml;
    requires transitive java.sql;

    opens org.openjfx.atividade to javafx.fxml;
    exports org.openjfx.atividade;
}
