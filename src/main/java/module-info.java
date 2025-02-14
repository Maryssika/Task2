module com.example.laba6 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.laba6 to javafx.fxml;
    exports com.example.laba6;
    exports Figyri;
    opens Figyri to javafx.fxml;
    exports Factory;
    opens Factory to javafx.fxml;
}