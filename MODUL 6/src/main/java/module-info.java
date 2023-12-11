module hafiz.praktikum6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens hafiz.praktikum6 to javafx.fxml;
    exports hafiz.praktikum6;
}