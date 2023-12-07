package org.openjfx.atividade;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("menu"), 826, 496);
        App.stage = stage;
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

    public static void changeView(String nomeTela) {
        try {
            stage.setScene(new Scene(loadFXML(nomeTela)));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void showPopup(String nomeTelaPopup) {
        // try {
        //     AnchorPane content = FXMLLoader.load(App.class.getResource(nomeTelaPopup + ".fxml"));
        //     Popup popup = new Popup();
        //     popup.getContent().add(content);
        //     popup.show(stage);
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
        
    }
}