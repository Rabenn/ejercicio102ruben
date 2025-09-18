package es.ruben;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Clase principal que carga la interfaz de usuario desde un archivo FXML.
 * La estructura y los estilos están definidos en App.fxml y styles.css.
 */
public class App extends Application {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {


        logger.info("Lanzador lanzado");

        // Leemos con FXMLLoader y a partir de ahi construimos los objetos
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/App.fxml"));

        Parent root = loader.load();

        // Crea la escena desde el FXML.
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("css/styles.css").toExternalForm());

        // Muestra la ventana (Stage).
        stage.setTitle("FlowPane Alignment (desde FXML)");
        stage.setScene(scene);
        stage.show();
    }
}