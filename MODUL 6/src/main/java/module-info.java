module hafiz.modul6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens hafiz.modul6 to javafx.fxml;
    exports hafiz.modul6;
}