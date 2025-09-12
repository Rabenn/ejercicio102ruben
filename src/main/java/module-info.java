module es.ruben {
    requires javafx.controls;
    requires javafx.fxml;

    opens es.ruben to javafx.fxml;
    exports es.ruben;
}