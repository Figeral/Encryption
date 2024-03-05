module com.encryption {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.encryption to javafx.fxml;
    exports com.encryption;
}
