open module GUI {
    requires Module1;
    requires Module2;
    requires javafx.controls;
    requires javafx.fxml;
    requires org.junit.jupiter.api;
    requires org.apache.commons.lang3;
    exports com.example.gui;
}
