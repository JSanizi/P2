module example.logingui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens example.logingui to javafx.fxml;
    exports example.logingui;
}