package org.example.gui;
import com.gluonhq.maps.MapView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        // Crea la mappa
        MapView mapView = new MapView();
        mapView.setZoom(3); // Zoom mondiale
        mapView.addLayer(new CustomMapLayer()); // ⚠️ Assicurati che CustomMapLayer esista

        // Inserisci la mappa in un layout (StackPane è semplice e adatto)
        StackPane root = new StackPane(mapView);

        // Crea la scena
        Scene scene = new Scene(root, 1000, 700);

        // Configura e mostra la finestra
        stage.setTitle("Mappa OpenStreetMap - JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        System.setProperty("javafx.platform", "desktop");
        launch(args);
    }
}