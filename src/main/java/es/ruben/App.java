package es.ruben;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Clase principal que extiende Application para crear una aplicación JavaFX.
 * Se muestran varios FlowPane con distinta alineación y estilos aplicados desde un CSS externo.
 */
public class App extends Application {
    public static void main(String[] args) {
        // Lanza la aplicación JavaFX
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        // Creamos tres FlowPane con diferentes alineaciones
        FlowPane fp1 = createFlowPane(Pos.BOTTOM_RIGHT);
        FlowPane fp2 = createFlowPane(Pos.BOTTOM_LEFT);
        FlowPane fp3 = createFlowPane(Pos.CENTER);

        // Contenedor horizontal que agrupa los tres FlowPane
        HBox root = new HBox(fp1, fp2, fp3);

        // Creamos la escena principal con el contenedor root
        Scene scene = new Scene(root);

        // Enlace con el archivo CSS externo (ubicado en resources/es/ruben/styles.css)
        scene.getStylesheets().add(getClass().getResource("/es/ruben/styles.css").toString());

        // Configuración de la ventana (Stage)
        stage.setScene(scene);
        stage.setTitle("FlowPane Alignment");
        stage.show();
    }

    /**
     * Método auxiliar que crea un FlowPane con botones y un texto,
     * aplicando una alineación específica.
     */
    private FlowPane createFlowPane(Pos alignment) {
        // Crea un FlowPane con espacio horizontal y vertical de 5 píxeles
        FlowPane fp = new FlowPane(5, 5);
        fp.setPrefSize(200, 100);
        fp.setAlignment(alignment);

        // Añade un texto con el nombre de la alineación y tres botones
        fp.getChildren().addAll(
                new Text(alignment.toString()),
                new Button("Button 1"),
                new Button("Button 2"),
                new Button("Button 3")
        );

        // En vez de aplicar estilos en línea, se le asigna la clase CSS "flow-pane"
        fp.getStyleClass().add("flow-pane");

        return fp;
    }
}